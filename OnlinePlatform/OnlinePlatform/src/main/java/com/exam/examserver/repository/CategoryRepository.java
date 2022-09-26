package com.exam.examserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.Category;
import com.exam.examserver.model.User;

public interface CategoryRepository extends JpaRepository<Category,Long>{
      
	
}
