package com.kttkpm_tuan1_may2.repositories;

import com.kttkpm_tuan1_may2.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}