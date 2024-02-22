//ProductController.java
package sean.springbootaopdemo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import sean.springbootaopdemo.model.Product;
import sean.springbootaopdemo.service.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }
    
    @GetMapping("/getProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProduct/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }
    
    @PostMapping(" ")
    public Product addProduct(@RequestBody Product p){
        return productService.addProduct(p);
    }

    @PutMapping("/updateProduct/{productId}")
    public Product updateProduct(@PathVariable Long productId, @RequestBody Product updatedProduct){
        return productService.updateProduct(productId, updatedProduct);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public Product deleteProduct(@PathVariable Long productId){
        return productService.deleteProduct(productId);
    }
}
