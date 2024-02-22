//TestDataLoader.java
package sean.springbootaopdemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sean.springbootaopdemo.model.Product;
import sean.springbootaopdemo.service.ProductService;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final ProductService productService;

    public TestDataLoader(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Adding 10 test data items
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setProductName("Product " + (i + 1));
            product.setPrice(10.0 * (i + 1)); // Assuming a price pattern
            productService.addProduct(product);
        }
        System.out.println("Test data loaded successfully.");
    }
}
