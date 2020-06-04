package com.recipe.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.recipe.demo.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
