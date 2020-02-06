package com.estudandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudandospring.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
