package com.sanix.RecipeApp.repositories;

import com.sanix.RecipeApp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
