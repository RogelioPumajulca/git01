package com.upc.factory;

import com.upc.service.IDocenteservice;
import com.upc.service.ITallerservice;
import com.upc.service.IUniversidadservice;
import com.upc.service.impl.Docenteserviceimpl;
import com.upc.service.impl.Tallerserviceimpl;
import com.upc.service.impl.Universidadserviceimpl;

public class Factory {

	//Implementacion de singleton
	private static Factory fac;
	
	private Factory(){
		
	}
	
	public static Factory getInstance(){
		if (fac == null) 
			fac = new Factory();
		return fac;
	}
	//fin de implementacion singleton
	
	//Se definen los servicios
	public IDocenteservice getDocenteservice(){
		return new Docenteserviceimpl();
	}
	
	public IUniversidadservice getUniversidadservice(){
		return new Universidadserviceimpl();
	}
	
	public ITallerservice getTallerservice(){
		return new Tallerserviceimpl();
	}
		
}
