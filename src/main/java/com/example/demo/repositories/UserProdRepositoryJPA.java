package com.example.demo.repositories;

import com.example.demo.general.UserProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserProdRepositoryJPA extends JpaRepository<UserProduct, Long> {

    @NonNull
    Optional<UserProduct> findById(@NonNull Long productId);

    Optional<List<UserProduct>> findAllByUserId(Long userId);

}
