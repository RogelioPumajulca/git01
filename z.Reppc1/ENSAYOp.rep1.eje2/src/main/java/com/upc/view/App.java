package com.upc.view;

import java.util.ArrayList;
import java.util.List;

import com.upc.dao.gestorempleados;
import com.upc.entity.contratado;
import com.upc.entity.empleado;
import com.upc.entity.freelance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
        gestorempleados gemp=new gestorempleados();
        empleado ec1= new contratado(1, "nombre1", 2, "fecha1", 100, false, 0);
        empleado ec2= new contratado(2, "nombre2", 2, "fecha1", 200, false, 0);
        empleado ec3= new contratado(3, "nombre3", 2, "fecha1", 300, false, 0);
        gemp.agregarempleados(ec1);gemp.agregarempleados(ec2);gemp.agregarempleados(ec3);
        
        
        empleado ef1 =  new freelance(1, "nombre4", 10, 6);
        empleado ef2 =  new freelance(2, "nombre5", 20, 7);
        empleado ef3 =  new freelance(3, "nombre6", 30, 8);
        gemp.agregarempleados(ef1);gemp.agregarempleados(ef2);gemp.agregarempleados(ef3);
        
        List<empleado> listaemp = gemp.listarempleados();
        
        for (empleado empleado : listaemp) {
			if(empleado!=null){
				System.out.println(" El empleado: "+empleado.getNombre()+" ||de codigo: "+empleado.getCodigo());
					//OJO OJO OJO OJO
					if (empleado instanceof contratado) {
						System.out.println("TRABAJ CONTRAT || con sueldo: "+empleado.calculasueldo());
					}else{
						System.out.println("TRABAJ freelanc || con sueldo: "+empleado.calculasueldo());
					}
			}
			else{
				System.out.println("mal pue..");}
		}
       
    }
}
