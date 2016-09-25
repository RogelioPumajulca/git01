package com.upc.view;

import java.util.Scanner;

import com.upc.entity.circulo;
import com.upc.entity.cuadrado;
import com.upc.entity.rectangulo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //  	System.out.println( "" );
        
    	System.out.println( "OPCIONES:\n 1.-Cuadrado  \n 2.-Rectrangulo  \n 3.-Circulo \n 4.-salir" );
    	System.out.println( "ingresa opcion: " );
    	Scanner l = new Scanner(System.in);
    	
    	int opcion;
    	opcion = l.nextInt();
    	
    while (opcion!=4) {
		
    	switch (opcion) {
		case 1:
				cuadradito();
			break;
		case 2:
				rectangulito();
			break;
		case 3:
				circulito();
			break;

		default:
			break;
		}
    	l.nextLine();
    	
    	System.out.println( "OPCIONES:\n 1.-Cuadrado  \n 2.-Rectrangulo  \n 3.-Circulo \n 4.-salir" );
    	System.out.println( "ingresa opcion: " );
    	//Scanner lee = new Scanner(System.in); 	
    	opcion=l.nextInt();
    
    }
    	
    }

	private static void circulito() {
		// TODO Auto-generated method stub
    	String nombre;
    	int codigo;
    	double lado,lado2;
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println( "ingresa nombre" );
    	nombre=leer.nextLine();
    	
    	System.out.println( "ingresa codigo" );
    	codigo=leer.nextInt();
    	
    	System.out.println( "ingresa radio" );
    	lado=leer.nextDouble();
        
    	circulo cir = new circulo(nombre, codigo,lado);
    	System.out.println( " RESULTADO:"+cir.toString() );
    	leer.nextLine();
		
	}

	private static void rectangulito() {
		// TODO Auto-generated method stub
    	String nombre;
    	int codigo;
    	double lado,lado2;
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println( "ingresa nombre" );
    	nombre=leer.nextLine();
    	
    	System.out.println( "ingresa codigo" );
    	codigo=leer.nextInt();
    	
    	System.out.println( "ingresa lado" );
    	lado=leer.nextDouble();
        
    	System.out.println( "ingresa lado" );
    	lado2=leer.nextDouble();
    	
    	rectangulo rect = new rectangulo(nombre, codigo,lado,lado2);
    	System.out.println( " RESULTADO:"+rect.toString() );
    	leer.nextLine();
	}

	private static void cuadradito() {
		// TODO Auto-generated method stub
    	String nombre;
    	int codigo;
    	double lado,lado2;
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println( "ingresa nombre" );
    	nombre=leer.nextLine();
    	
    	System.out.println( "ingresa codigo" );
    	codigo=leer.nextInt();
    	
    	System.out.println( "ingresa lado" );
    	lado=leer.nextDouble();
        
    	cuadrado cuad = new cuadrado(nombre, codigo,lado);
    	System.out.println( " RESULTADO:"+cuad.toString() );
    	leer.nextLine();
	}
}
