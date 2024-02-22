//ProductReposiroty.java
package sean.springbootaopdemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sean.springbootaopdemo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
