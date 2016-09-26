package com.upc.factory;

import com.upc.service.PIMateservice;
import com.upc.service.impl.Mateservice;

//SE SEGUIRA EL PATRON SIGLETON
public class Factory {
	
/*Static para poder acceder 
desde UNA UNICA INSTANCIA DE ESTA CLASE de ese modo 
dejaremos de usar NEW en los metodos de servlet(servicio) 
para llamar a Interface, se le llamara desde acá */
	private static Factory fac;	
	static{
		fac=new Factory();
	}
	public static Factory obtenerInstanciaFactory(){
		return fac;
	}
	//registrar servicios
	public PIMateservice obtenerMateservice(){
		return new Mateservice();
	}
}
