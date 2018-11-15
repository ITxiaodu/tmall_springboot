package com.du.tmall.service;

import com.du.tmall.dao.CategoryDao;
import com.du.tmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;

    public List<Category> list(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return categoryDao.findAll(sort);
    }
}
