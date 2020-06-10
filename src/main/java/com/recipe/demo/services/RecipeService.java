package com.recipe.demo.services;

import java.util.Set;

import com.recipe.demo.domain.Recipe;
import org.springframework.stereotype.Service;

public interface RecipeService {

    Set<Recipe> getRecipes();
    public Recipe findById(Long l);
}
