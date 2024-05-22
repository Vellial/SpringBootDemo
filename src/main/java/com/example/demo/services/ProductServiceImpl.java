package com.example.demo.services;

import com.example.demo.general.UserProduct;
import com.example.demo.repositories.UserProdRepositoryJPA;
import com.example.demo.services.interfaces.ProductInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductInterface {

    private final UserProdRepositoryJPA userProdRepositoryJPA;

    public ProductServiceImpl(UserProdRepositoryJPA userProdRepositoryJPA) {
        this.userProdRepositoryJPA = userProdRepositoryJPA;
    }
    @Override
    public UserProduct getProductByProductId(Long productId) {
        return userProdRepositoryJPA.findById(productId).orElseThrow();
    }

    @Override
    public List<UserProduct> getAllProductsByUserId(Long userId) {
        return userProdRepositoryJPA.findAllByUserId(userId).orElseThrow();
    }
}
