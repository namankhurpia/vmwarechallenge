package com.namankhurpia.order.service;


import java.util.ArrayList;
import java.util.List;

import com.namankhurpia.order.model.ListofShapes;

public interface ShapeService {
	
	ListofShapes get(int taskId);
	
	List<ListofShapes> getAll();
	
	List<ListofShapes> save(List<ListofShapes> shapes);
	

}
