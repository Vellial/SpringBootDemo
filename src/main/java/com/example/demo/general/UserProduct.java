package com.example.demo.general;

import javax.persistence.*;

@Entity
@Table(name = "user_products")
public class UserProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "billing_number")
    private String billingNumber;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "product_type")
    private String productType;

    Long userId;

    public UserProduct(String billingNumber, Double balance, String productType) {
        this.balance = balance;
        this.billingNumber = billingNumber;
        this.productType = productType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillingNumber() {
        return billingNumber;
    }

    public void setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
