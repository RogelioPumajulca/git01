package com.upc.service.impl;
import com.upc.service.PIMateservice;
public class Mateservice implements PIMateservice{

	@Override
	public int suma(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1+n2);
	}

	@Override
	public int producto(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1*n2);
	}

	@Override
	public long factorial(int n1) {
		// TODO Auto-generated method stub
		long f=1;
		while (n1>1) {
			f*=n1--;
		}
		return f;
	}

	
}
