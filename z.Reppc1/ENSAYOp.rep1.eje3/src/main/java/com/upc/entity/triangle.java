package com.upc.entity;

public class triangle extends shape{

	int base;
	int height;
	
	
	@Override
	public void moveup() {
		// TODO Auto-generated method stub
		//super.moveup();
		System.out.println("triangulo arriba");
	}

	@Override
	public void movedown() {
		// TODO Auto-generated method stub
		//super.movedown();
		System.out.println("triangulo abajo");
	}

	@Override
	public void moveleft() {
		// TODO Auto-generated method stub
		//super.moveleft();
		System.out.println("triangulo izquierda");
	}

	@Override
	public void moveright() {
		// TODO Auto-generated method stub
		//super.moveright();
		System.out.println("triangulo derecha");
	}

	///

	public triangle(String color,int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}



	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return base*height/2;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+" ||De triangle Area: "+getarea()+
		" base y altura: "+getBase()+" y "+getHeight();
	}



	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
}
