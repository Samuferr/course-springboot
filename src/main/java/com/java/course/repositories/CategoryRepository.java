package com.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.course.entities.User;

public interface CategoryRepository extends JpaRepository <User, Long> {

}
