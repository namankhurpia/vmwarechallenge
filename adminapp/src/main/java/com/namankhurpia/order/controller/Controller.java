package com.namankhurpia.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.ListofShapes;
import com.namankhurpia.order.service.ShapeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
	
	@Autowired
	private ShapeService shapeservice;
	
	@GetMapping("getall")
	public List<ListofShapes> getAll()
	{
		return shapeservice.getAll();
	}
	
	@GetMapping("/getshape/{taskId}")
	public ListofShapes GetShapefromId(@PathVariable int taskId){
		try {
			
			return shapeservice.get(taskId);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception in getshapefromId :" + e.getMessage());
			return null;
		}
		
	}
	
	@PostMapping("/addshape")
	public List<ListofShapes> save(@RequestBody ArrayList<ListofShapes> shapeList)
	{
		try {
			return shapeservice.save(shapeList);
		}
		catch(Exception e)
		{
			System.out.println("Exception in adding a shape :" + e.getMessage());
			return null;
		}
	}
	
	
	

}
