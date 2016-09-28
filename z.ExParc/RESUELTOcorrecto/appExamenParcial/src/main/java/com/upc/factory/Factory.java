package com.upc.factory;

import com.upc.service.IDepartamentoservice;
import com.upc.service.IEmpleadoservice;
import com.upc.service.impl.Departamentoserviceimpl;
import com.upc.service.impl.Empleadoserviceimpl;

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
	public IDepartamentoservice getDepartamentoservice(){
		return new Departamentoserviceimpl();
	}
	
	public IEmpleadoservice getEmpleadoservice(){
		return new Empleadoserviceimpl();
	}
	
	
		
}
