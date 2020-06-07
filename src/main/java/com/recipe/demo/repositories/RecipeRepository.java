package com.recipe.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.recipe.demo.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
