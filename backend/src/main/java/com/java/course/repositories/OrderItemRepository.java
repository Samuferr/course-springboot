package com.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
