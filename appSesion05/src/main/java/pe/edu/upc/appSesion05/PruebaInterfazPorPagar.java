package pe.edu.upc.appSesion05;

import pe.edu.upc.entity.EmpleadoAsalariado;
import pe.edu.upc.entity.Factura;
import pe.edu.upc.interfaces.PorPagar;

// Prueba la interfaz PorPagar.

public class PruebaInterfazPorPagar {
	public static void main(String[] args) {
		// crea arreglo PorPagar con cuatro elementos
	     PorPagar[] objetosPorPagar = new PorPagar[ 4 ];
	      
	      // llena el arreglo con objetos que implementan la interfaz PorPagar
	      objetosPorPagar[ 0 ] = new Factura( "01234", "asiento", 2, 375.00 );
	      objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95 );
	      objetosPorPagar[ 2 ] = 
	         new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00 );
	      objetosPorPagar[ 3 ] = 
	         new EmpleadoAsalariado( "Lisa", "Barnes", "888-88-8888", 1200.00 );

	      System.out.println( 
	         "Facturas y Empleados procesados en forma polimorfica:\n" ); 

	      // procesa en forma generica cada elemento en el arreglo objetosPorPagar
	      for (PorPagar porPagar : objetosPorPagar) {
			System.out.println(porPagar);
			System.out.println(porPagar.calcularPago());
		}
	} 
}
