package com.example.demo.services.interfaces;

import com.example.demo.general.UserProduct;

import java.util.List;

public interface ProductInterface {
    UserProduct getProductByProductId(Long productId);

    List<UserProduct> getAllProductsByUserId(Long userId);
}
