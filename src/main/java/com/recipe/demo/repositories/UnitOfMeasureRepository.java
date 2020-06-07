package com.recipe.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.recipe.demo.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by jt on 6/13/17.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
