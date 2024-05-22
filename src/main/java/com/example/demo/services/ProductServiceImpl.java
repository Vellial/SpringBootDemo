package com.example.demo.services;

import com.example.demo.general.UserProduct;
import com.example.demo.repositories.UserProductRepo;
import com.example.demo.services.interfaces.ProductInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductInterface {
    private UserProductRepo userProductRepo;

    public ProductServiceImpl(UserProductRepo userProductRepo) {
        this.userProductRepo = userProductRepo;
    }
    @Override
    public UserProduct getProductByProductId(Long productId) {
        return userProductRepo.getProductById(productId);
    }

    @Override
    public List<UserProduct> getAllProductsByUserId(Long userId) {
        return userProductRepo.getAllUserProducts();
    }
}
