package com.upc.test;

import java.util.List;

import com.upc.dto.Docente;
import com.upc.dto.Taller;
import com.upc.dto.Universidad;
import com.upc.factory.Factory;
import com.upc.service.IDocenteservice;
import com.upc.service.ITallerservice;
import com.upc.service.IUniversidadservice;
import com.upc.service.impl.Docenteserviceimpl;
import com.upc.service.impl.Universidadserviceimpl;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// TODO Test 1
		/*IUniversidadservice service2 = Factory.getInstance()
		 					.getUniversidadservice();

		Universidad u1 = new Universidad();
		u1.setNombre("UPC");

		Universidad u2 = new Universidad();
		u2.setNombre("OTRA UNIVERSIDAD");

		service2.create(u1);
		service2.create(u2);*/
		
		//TODO Test 2
		/*IDocenteservice s2=Factory.getInstance()
				.getDocenteservice();
		
		Docente d=new Docente();
		Universidad u=new Universidad();
		d.setNombre("Pepe");
		u.setIduniversidad(1);
		d.setUniversidad(u);
		
		s2.create(d);*/
		
		ITallerservice s3=Factory.getInstance().
				getTallerservice();
		
		Docente d=new Docente();
		d.setIddocente(1);
		Taller t=new Taller();
		t.setNombre("Desarrollo en Web");
		t.setDescripcion("Spring MVC ");
		t.setDocente(d);
		
		s3.create(t);
		
		List<Taller> talleres=s3.getAll();
		
		for (Taller t1 : talleres) {
			System.out.println("Talleres:"+t1.getNombre()
			+" Docente:"+t1.getDocente().getNombre());
		}
		

	}

}
