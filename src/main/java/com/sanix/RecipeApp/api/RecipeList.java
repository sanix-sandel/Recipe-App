package com.sanix.RecipeApp.api;

import com.sanix.RecipeApp.domain.Recipe;
import com.sanix.RecipeApp.services.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/ingredients/")
public class RecipeList {

    private final RecipeService recipeService;

    public RecipeList(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public Set<Recipe> indexRecipe(){
        return recipeService.getRecipes();
    }
}
