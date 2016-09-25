package com.upc.app;

import java.util.ArrayList;
import java.util.List;

import com.upc.entity.Departamento;
import com.upc.entity.Empleado;
import com.upc.entity.Proyecto;
import com.upc.entity.Tarea;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ejerc1");
		
		Departamento d1 = new Departamento();
		d1.setCodigo(123);
		d1.setNombre("sistemas");
		d1.setLocalizacion("upc san isidro");
		
		Departamento d2 = new Departamento();
		d2.setCodigo(321);
		d2.setNombre("software");
		d2.setLocalizacion("upc monte");
		
		Proyecto p=new Proyecto();
		p.setCodigo(321);
		p.setNombre(" Proyect Apocalipsis");
		p.setMax_horas(400);
		
		Empleado e=new Empleado(4169,"Moises",123,d1);
		Empleado e2=new Empleado(666,"Jhair",123,d1);
		
		
		Tarea t = new Tarea("11/11/16",12,"nose px",e,p);
		
		List<Tarea> lt = new ArrayList<>();
		lt.add(t);		
		for (Tarea tarea : lt) {
			System.out.println("Tarea: "+ tarea.getDescripcion());
		}
		
		
		List<Empleado> le = new ArrayList<>();
		le.add(e);
		le.add(e2);
		for (Empleado empleado : le) {
			System.out.println("Empleado: "+ empleado.getNombre());
		}
			
		
		List<Departamento> ld = new ArrayList<>();
		ld.add(d1);
		ld.add(d2);
		for (Departamento departamento : ld) {
			System.out.println("Departamento: "+ departamento.getNombre());
		}
		
		
	}

}
