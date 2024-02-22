//ProductService.java
package sean.springbootaopdemo.service;
import java.util.List;
import sean.springbootaopdemo.model.Product;

public interface ProductService {
    
    List <Product> getAllProducts();
    Product getProductById(Long productId);
    Product addProduct(Product p);
    Product updateProduct(Long productId, Product updatedProduct);
    Product deleteProduct(Long productId);
    
}
