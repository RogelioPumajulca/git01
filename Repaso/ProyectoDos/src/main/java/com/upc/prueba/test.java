package com.upc.prueba;

import java.util.ArrayList;
import java.util.List;

import com.upc.app.entity.Contratado;
import com.upc.app.entity.Empleado;
import com.upc.app.entity.Freelance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Ejercicio 2 ");
		
		List<Empleado> le = new ArrayList<>();
		
		Empleado e1 = new Contratado(12,"Glenny",12,1234);
		Empleado e2 = new Freelance(13,"Glenny segundo",14,25);
		
		Contratado e3;
		e3=(Contratado)e1;// ojo ESTO ES CASTING, convierte objto Empleado a Contratado
		
		le.add(e1);
		le.add(e2);
				
		
		for (Empleado empleado : le) {
			System.out.println("Sueldo: "+ empleado.calcularSueldo());
		}
		
	}

}
