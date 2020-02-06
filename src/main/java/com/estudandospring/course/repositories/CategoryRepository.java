package com.estudandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudandospring.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
