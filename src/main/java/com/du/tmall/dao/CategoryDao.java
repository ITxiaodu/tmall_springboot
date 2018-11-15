package com.du.tmall.dao;

import com.du.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer>{
}
