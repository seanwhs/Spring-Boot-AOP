//Product.java
package sean.springbootaopdemo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="prod_info")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="prod_id")
    private Long productId;

    @Column(name="prod_name")
    private String productName;
    
    @Column(name="prod_price")
    private Double price;

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    
}
