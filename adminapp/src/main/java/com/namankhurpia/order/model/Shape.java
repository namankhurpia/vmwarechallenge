package com.namankhurpia.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Shape {
	
	
	public String type; 
	
	public String param1 ;
	
	//this param is optional
	public String param2 ;
	
	public Shape() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}


	public Shape(String type, String param1, String param2) {
		super();
		this.type = type;
		this.param1 = param1;
		this.param2 = param2;
	}

	

	

}
