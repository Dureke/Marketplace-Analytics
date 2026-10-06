package io.github.dureke.marketplaceanalytics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "products")
public class Product {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marketplace_product_id")
    private String marketplaceProductId;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "listed_at")
    private OffsetDateTime listedAt;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    public Long getId() { return id; }
    public String getMarketplaceProductId() { return marketplaceProductId; }
    public BigDecimal getPrice() { return price; }
    public String getProductName() { return productName; }
    public OffsetDateTime getListedAt() { return listedAt; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public Integer getQuantity() { return quantity; }

    public void setMarketplaceProductId(String marketplaceProductId) { this.marketplaceProductId = marketplaceProductId; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setListedAt(OffsetDateTime listedAt) { this.listedAt = listedAt; }
    public void setCategory(String category) { this.category = category; }
    public void setDescription(String description) { this.description = description; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
