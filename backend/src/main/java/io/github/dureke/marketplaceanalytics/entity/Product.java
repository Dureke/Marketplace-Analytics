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
}
