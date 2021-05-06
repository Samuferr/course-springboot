package com.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.course.entities.Category;

public interface UserRepository extends JpaRepository <Category, Long> {

}
