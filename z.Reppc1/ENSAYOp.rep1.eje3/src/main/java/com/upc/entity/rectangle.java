package com.upc.entity;

public class rectangle extends shape{

	
	int length;
	int width;
	
	
	
	public rectangle(String color,int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}


	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" ||De rectang Area: "+getarea()+" con lados "+getLength()
		+" y "+getWidth();
	}
	
	@Override
	public void moveup() {
		// TODO Auto-generated method stub
		//super.moveup();
		System.out.println("rectangulo arriba");
	}
	

	@Override
	public void movedown() {
		// TODO Auto-generated method stub
		//super.movedown();
		System.out.println("rectangulo abajo");		
	}


	@Override
	public void moveleft() {
		// TODO Auto-generated method stub
		//super.moveleft();
		System.out.println("rectangulo izquierda");
	}


	@Override
	public void moveright() {
		// TODO Auto-generated method stub
		//super.moveright();
		System.out.println("rectangulo derecha");		
	}


	////////////////////////////////////////////////////
	////////////////////////////////////////////////////
	////////////////////////////////////////////////////

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
