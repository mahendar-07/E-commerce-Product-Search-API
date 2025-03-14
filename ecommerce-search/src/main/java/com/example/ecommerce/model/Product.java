package com.example.ecommerce.model;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
@SuppressWarnings("unused")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private Double rating;
    private Integer stock;

    // Default constructor
    public Product() {}

    // Constructor with parameters
    @SuppressWarnings("unused")
    public Product(String name, String category, Double price, Double rating, Integer stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

}
