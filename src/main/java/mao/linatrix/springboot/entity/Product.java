package mao.linatrix.springboot.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name="products",
        schema = "ecommerce",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "sku_unique",
                        columnNames = "stock_keeping_unit"
                )
        }
)
public class Product {

    // define fields
    // Hibernate creates PRIMARY KEY
    @Id
    // Hibernate creates AUTO_INCREMENT
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stock_keeping_unit",
            nullable = false)
    private String sku;

    @Column(nullable=false)
    private String name;

    private String description;

    private BigDecimal price;

    @Column(nullable = false)
    private boolean active;

    // Hibernate transfer field names from camelCase to
    // snake_case when no column name is given
    // e.g. imageUrl -> image_url
    private String imageUrl;

    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;

    // define constructors
    public Product() {
    }

    public Product(Long id, String stockKeepingUnit, String name, String description, BigDecimal price,
                   boolean active, String imageUrl, LocalDateTime dateCreated, LocalDateTime lastUpdated) {
        this.id = id;
        this.sku = stockKeepingUnit;
        this.name = name;
        this.description = description;
        this.price = price;
        this.active = active;
        this.imageUrl = imageUrl;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    // define getter/setter-methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // define toString() method
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", stockKeepingUnit='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", active=" + active +
                ", imageUrl='" + imageUrl + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

}
