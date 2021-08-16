package com.namankhurpia.order.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.login.repository.ShapeRepository;
import com.namankhurpia.order.model.ListofShapes;

@Repository
public class ShapeDAOImpl implements ShapeDAO {


	@Autowired
	private ShapeRepository repository;

	

	@Override
	public List<ListofShapes> getAll() {
		
		 Iterable<ListofShapes> arr = repository.findAll();
		 List<ListofShapes> result = new ArrayList<>();
		 arr.forEach(result::add);
		 return result;
		 
	}

	@Override
	public List<ListofShapes> save(List<ListofShapes> shapes) {
		
		Iterable<ListofShapes> arr =  repository.saveAll(shapes);
		List<ListofShapes> result = new ArrayList<>();
		 arr.forEach(result::add);
		 return result;
	}

	@Override
	public List<ListofShapes> get(int taskId) {
		
		 Optional<ListofShapes> arr = repository.findById(taskId);
		 return arr.map(Collections::singletonList)
		            .orElseGet(Collections::emptyList);

	}
	
	

	
}
