package pe.edu.upc.view;

import pe.edu.upc.entity.Frutae;
import pe.edu.upc.entity.Mermeladae;

public class appFruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frutae f1= new Frutae("Amarillo", "Dulce");
		Mermeladae m1= new Mermeladae("Rojo","Acido",1,"Vidrio");
	
		System.out.println(f1.toString());
		System.out.println(m1.toString());
		
		f1.toString();f1.soyunmetodoglobal();
		m1.toString();m1.soyunmetodoglobal();
		
		Frutae.LugarOrigen="Tierra";
		
		Frutae.soyunmetodoglobal();//
		
	}

	// EL STATIC HACE GLOBAL CUALQUIER METODO, POR LO TANTO CUALQUIER OBEJETO DE CUALQUIER CLASE LO PUEDE JALAR
	
}
