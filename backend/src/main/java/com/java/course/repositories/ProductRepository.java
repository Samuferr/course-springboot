package com.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.course.entities.Product;
import com.java.course.entities.User;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
