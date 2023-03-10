package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bean.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
	@Query("select c from Category c where c.cname = :cname")
	public List<Category> findByName(@Param("cname") String cname);
	
	
}
