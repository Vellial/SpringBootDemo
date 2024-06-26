package com.example.demo.controllers;

import com.example.demo.general.UserProduct;
import com.example.demo.services.interfaces.ProductInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/executor")
public class UserProductController {

    private final ProductInterface productInterface;

    public UserProductController(ProductInterface productInterface) {
        this.productInterface = productInterface;
    }

    @GetMapping(value = "/products/{productId}")
    public UserProduct getProduct(@PathVariable Long productId) {
        return productInterface.getProductByProductId(productId);
    }

    @GetMapping(value = "/users/{userId}")
    public List<UserProduct> getAllProducts(@PathVariable Long userId) {
        return productInterface.getAllProductsByUserId(userId);
    }
}
