package com.sanix.RecipeApp.services;

import com.sanix.RecipeApp.commands.RecipeCommand;
import com.sanix.RecipeApp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
