package com.sanix.RecipeApp.repositories;

import com.sanix.RecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
