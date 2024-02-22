//ProductServiceImpl
package sean.springbootaopdemo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import sean.springbootaopdemo.model.Product;
import sean.springbootaopdemo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }
    
    @Override
    public Product addProduct(Product p) {
        return productRepository.save(p);
    }
    
    public Product updateProduct(Long productId, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            Product existingProduct = optionalProduct.get();
            existingProduct.setProductName(updatedProduct.getProductName());
            existingProduct.setPrice(updatedProduct.getPrice());
            return productRepository.save(existingProduct);
        }
        return null; // or throw an exception indicating product not found
    }

    @Override
    public Product deleteProduct(Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            Product deletedProduct = optionalProduct.get();
            productRepository.deleteById(productId);
            return deletedProduct;
        }
        return null; // or throw an exception indicating product not found
    }
}
