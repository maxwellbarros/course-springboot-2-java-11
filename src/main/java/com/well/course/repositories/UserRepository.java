package com.well.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.well.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
