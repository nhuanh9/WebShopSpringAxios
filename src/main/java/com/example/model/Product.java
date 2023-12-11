package com.example.model;


import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private String description;

    private int inventoryQuantity;

    private String image;


    @ManyToOne
    private Supplier supplier;
    private int inventoryQuantity1;
    private int inventoryQuantity2;
    @Column(columnDefinition = "int default 0")
    private int amount;
    @Column(columnDefinition = "int default 0")
    private int amount1;
    @Column(columnDefinition = "int default 0")
    private int amount2;

    public int getAmount1() {
        return amount1;
    }

    public void setAmount1(int amount1) {
        this.amount1 = amount1;
    }

    public int getInventoryQuantity1
            () {
        return inventoryQuantity1;
    }

    public void setInventoryQuantity1(int inventoryQuantity1) {
        this.inventoryQuantity1 = inventoryQuantity1;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int stockquantity) {
        this.inventoryQuantity = stockquantity;
    }


    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getInventoryQuantity2() {
        return inventoryQuantity2;
    }

    public void setInventoryQuantity2(int inventoryQuantity2) {
        this.inventoryQuantity2 = inventoryQuantity2;
    }

    public int getAmount2() {
        return amount2;
    }

    public void setAmount2(int amount2) {
        this.amount2 = amount2;
    }
}
