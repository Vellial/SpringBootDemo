package com.example.demo.repositories;

import com.example.demo.general.UserProduct;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UserProductRepo {

    private JdbcTemplate jdbcTemplate;

    public UserProductRepo(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public UserProduct getProductById(Long id) {

        return jdbcTemplate.queryForObject(
                "select * from user_products where id = ?",
                (resultSet, rowNum) -> {
                    UserProduct newProduct = new UserProduct();
                    newProduct.setId(resultSet.getLong("id"));
                    newProduct.setUserId(resultSet.getLong("user_id"));
                    newProduct.setBalance(resultSet.getDouble("balance"));
                    newProduct.setProductType(resultSet.getString("product_type"));
                    newProduct.setBillingNumber("billing_number");
                    return newProduct;
                },
                id);

    }

    public List<UserProduct> getAllUserProducts() {
        return this.jdbcTemplate.query(
                "select * from user_products where user_id = ?",
                (resultSet, rowNum) -> {
                    UserProduct newProduct = new UserProduct();
                    newProduct.setId(resultSet.getLong("id"));
                    newProduct.setUserId(resultSet.getLong("user_id"));
                    newProduct.setBalance(resultSet.getDouble("balance"));
                    newProduct.setProductType(resultSet.getString("product_type"));
                    newProduct.setBillingNumber("billing_number");
                    return newProduct;
                });
    }


}
