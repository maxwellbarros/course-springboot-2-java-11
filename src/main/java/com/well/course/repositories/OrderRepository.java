package com.well.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.well.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
