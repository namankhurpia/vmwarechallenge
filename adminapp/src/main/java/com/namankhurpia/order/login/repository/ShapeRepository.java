package com.namankhurpia.order.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.namankhurpia.order.model.ListofShapes;

public interface ShapeRepository extends CrudRepository<ListofShapes, Integer> {
    
}

