package com.estudandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
