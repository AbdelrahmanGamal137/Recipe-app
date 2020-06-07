package com.recipe.demo.services;

import java.util.Set;

import com.recipe.demo.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
