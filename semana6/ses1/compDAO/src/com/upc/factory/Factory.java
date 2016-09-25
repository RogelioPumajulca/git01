package com.upc.factory;

import com.upc.dao.ICategoriadao;
import com.upc.dao.IPeliculadao;
import com.upc.dao.impl.Categoriadao;
import com.upc.dao.impl.Peliculadao;

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
		public ICategoriadao getCategoriadao(){
			return new Categoriadao();
		}
		
		public IPeliculadao getPeliculadao(){
			return new Peliculadao();
		}
		
		
			

}
