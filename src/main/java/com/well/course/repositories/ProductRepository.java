package com.well.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.well.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
