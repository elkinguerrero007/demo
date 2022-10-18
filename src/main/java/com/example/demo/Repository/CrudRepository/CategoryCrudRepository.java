package com.example.demo.Repository.CrudRepository;

import com.example.demo.Model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
