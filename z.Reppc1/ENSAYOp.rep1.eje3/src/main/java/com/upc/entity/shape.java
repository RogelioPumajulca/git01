package com.upc.entity;

import com.upc.service.Imovable;

public abstract class shape implements Imovable{

	String color;
	
	public abstract double getarea();//solo classes abstract tienen metodos abstract

	@Override
	public String toString() {
		return " ||De shape, color: " +getColor();
	}
	
	
	
	public shape(String color) {
		super();
		this.color = color;
	}

	//auto generado	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void moveup() {
		// TODO Auto-generated method stub
		
	}

	public void movedown() {
		// TODO Auto-generated method stub
		
	}

	public void moveleft() {
		// TODO Auto-generated method stub
		
	}

	public void moveright() {
		// TODO Auto-generated method stub
		
	}

	
}
