package com.namankhurpia.order.DAO;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.namankhurpia.order.model.ListofShapes;


public interface ShapeDAO {
	
	List<ListofShapes> get(int taskId);
	
	List<ListofShapes> getAll();
	
	List<ListofShapes> save(List<ListofShapes> shapes);

}
