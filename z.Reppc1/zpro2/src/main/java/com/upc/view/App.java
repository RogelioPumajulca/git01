package com.upc.view;

import java.util.List;
import java.util.Scanner;

import com.upc.dao.gestorempleado;
import com.upc.entity.contratado;
import com.upc.entity.empleado;
import com.upc.entity.freelance;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main( String[] args )
    {	//menu/////////////////////
    	
	    	Scanner leer = new Scanner(System.in);
	    	int opcion=0;
	    	gestorempleado ge = new gestorempleado();
	    	
	    	
			while(opcion!=5){
				System.out.println( " Menu: \n 1.-Ingresar Empleado contratado \n 2.-Ingresar Empleado Freelance "
		    			+ "\n 3.-Listar Contratados \n 4.-Listar Freelance \n 5.-Salir" );
		    	opcion=leer.nextInt();
			    	switch (opcion) {
					case 1:
							ingresarcontratado(ge);
						break;
					case 2:
							ingresarfreelance(ge);
						break;
					case 3:
							listarcontratado(ge);
						break;
					case 4:
							listarfreelance(ge);
						break;
					case 5:
						return;
					default:
						break;
					}
			    	
			}
    	////////////////////////////
    	    
	        
/*        
        List<empleado> listempl = ge.obtenerlistemp();
        
        for (empleado empleado : listempl) {
			if (empleado instanceof contratado) {
				System.out.println("||ES CONT|| "+empleado.toString()+" TOTAL:"+(empleado.calcularsueldo()+empleado.calcularbonificacion()));
			}else {
				System.out.println("||ES FREE|| "+empleado.toString()+" TOTAL:"+(empleado.calcularsueldo()+empleado.calcularbonificacion()));
			}
		}
*/		
        ///////////////////////////////
        
    }

	private static void listarfreelance(gestorempleado ge) {

		List<empleado> listempl = ge.obtenerlistemp();
        
        for (empleado empleado : listempl) {
			if (empleado instanceof freelance) {
				System.out.println("||ES FREE|| "+empleado.toString()+" TOTAL:"+(empleado.calcularsueldo()+empleado.calcularbonificacion()));
				}
		}
	}

	private static void listarcontratado(gestorempleado ge) {
		
		List<empleado> listempl = ge.obtenerlistemp();
        
        for (empleado empleado : listempl) {
			if (empleado instanceof contratado) {
				System.out.println("||ES CONT|| "+empleado.toString()+" TOTAL:"+(empleado.calcularsueldo()+empleado.calcularbonificacion()));
			}
		}
	}

	private static void ingresarfreelance(gestorempleado ge) {
		
		System.out.println( "  \n" );
		Scanner leer= new Scanner(System.in);
		int codigo,tiempo;String nombre; double pago1;
		
		System.out.println( " Ingrese freelance " );
		System.out.println( " Codigo: \n " );
		codigo=leer.nextInt();leer.nextLine();
		
		System.out.println( " Nombre \n" );
		nombre=leer.nextLine();leer.nextLine();
		
		System.out.println( " Pago1 \n" );
		pago1=leer.nextDouble();leer.nextLine();
		
		System.out.println( " PAgo2 \n" );
		tiempo=leer.nextInt();leer.nextLine();
		
		empleado e = new freelance(codigo, nombre, pago1, tiempo);
		ge.agregarempleado(e);
/*		
		
		empleado ef1 = new freelance(1, "empleB1", 20, 20);
        empleado ef2 = new freelance(2, "empleB2", 21, 21);
        empleado ef3 = new freelance(3, "empleB3", 22, 22);
        empleado ef4 = new freelance(4, "empleB4", 23, 23);
        ge.agregarempleado(ef1);ge.agregarempleado(ef2);
        ge.agregarempleado(ef3);ge.agregarempleado(ef4);
*/	
	}

	
	private static void ingresarcontratado(gestorempleado ge) {
	    empleado ec1 = new contratado(1, "empleC1", 10, "1900", 100, false, 1);
        empleado ec2 = new contratado(2, "empleC2", 11, "1900", 101, false, 2);
        empleado ec3 = new contratado(3, "empleC3", 12, "1900", 102, false, 3);
        empleado ec4 = new contratado(4, "empleC4", 13, "1900", 103, false, 4);
        ge.agregarempleado(ec1);ge.agregarempleado(ec2);
        ge.agregarempleado(ec3);ge.agregarempleado(ec4);  
        
	}

}
