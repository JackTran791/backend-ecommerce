package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jack Tran
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
