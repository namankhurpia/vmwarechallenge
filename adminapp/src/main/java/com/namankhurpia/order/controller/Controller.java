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
import com.namankhurpia.order.model.ReturnView;
import com.namankhurpia.order.model.Shape;
import com.namankhurpia.order.processors.Calculate;
import com.namankhurpia.order.service.ShapeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
	
	@Autowired
	private ShapeService shapeservice;
	
	@Autowired
	private Calculate calculate;
	
	@GetMapping("getall")
	public ArrayList<ReturnView> getAll()
	{
		try {
			ArrayList<ReturnView> returnlist = new ArrayList<ReturnView>();	
		List<ListofShapes> list = shapeservice.getAll();
		for(int i=0;i<list.size();i++)
		{
			ReturnView object = new ReturnView();
			Shape obj = list.get(i).getShape();
			if(obj.getType().equalsIgnoreCase("circle"))
			{
				String param1 = obj.getParam1();
				String param2 = obj.getParam2();
				object.setArea(calculate.calculateforCircle(Integer.parseInt(param1)));
				
				object.setTaskID(list.get(i).getTaskID());
				returnlist.add(object);
				
			}
			else if(obj.getType().equalsIgnoreCase("sqaure"))
			{
				String param1 = obj.getParam1();
				String param2 = obj.getParam2();
				object.setArea(calculate.calculateforSqaure(Integer.parseInt(param1)));
				
				object.setTaskID(list.get(i).getTaskID());
				returnlist.add(object);
			}
			else if(obj.getType().equalsIgnoreCase("rectangle"))
			{
				String param1 = obj.getParam1();
				String param2 = obj.getParam2();
				object.setArea(calculate.calculateforRectangle(   (Integer.parseInt(param1)),(Integer.parseInt(param2))     ));
				
				object.setTaskID(list.get(i).getTaskID());
				returnlist.add(object);
			}
			else
			{
				throw new Exception(); 
			}
		}
		
		return returnlist;
		}
		catch(Exception e)
		{
			return null;
		}
		
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
