package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PropertyDAO extends JpaRepository<Property,Integer> {
    Page<Property> findByCategory(Optional<Category> category, Pageable pageable);
    List<Property> findByCategory(Category category);
}
