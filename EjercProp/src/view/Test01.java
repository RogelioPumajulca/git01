package view;

import java.util.Scanner;
import model.dao.ListaCursos;
import model.dao.ListaFormaPagos;
import model.dao.ListaInscripciones;
import model.entity.Curso;
import model.entity.FormaPago;
import model.entity.Inscripcion;
import services.ICurso;
import services.IFormaPago;
import services.IInscripcion;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ICurso lCurso = new ListaCursos();            
        IFormaPago lFormaPago = new ListaFormaPagos();
        IInscripcion lInscripcion = new ListaInscripciones();
        int opcion=0;
        while (true) {            
            Scanner oScanner = new Scanner(System.in);
            
            System.out.println(" 1. Registrar Curso");
            System.out.println(" 2. Listar Cursos");
            
            System.out.println(" 3. Registrar Forma de Pago");
            System.out.println(" 4. Listar Forma Pago");            
            
            System.out.println(" 5. Registrar Inscripcion");
            System.out.println(" 6. Listar Inscripciones");
            
            System.out.println(" 7. salir");
            System.out.println(" Ingresar Opción: ");
            
            opcion= oScanner.nextInt() ;
            
            switch(opcion){
                case 1:
                        registrarCursoss(lCurso);
                        break;
                case 2:
                        listarCursoss(lCurso);
                        break;
                case 3:
                        registrarFormaPagoss(lFormaPago);
                        break;
                case 4:
                        listarFormaPagoss(lFormaPago);
                        break;
                case 5:
                        registrarInsripcion(lCurso,lFormaPago,lInscripcion);
                        break;
                case 6:
                        listarPersonas(lInscripcion);
                        break;
                case 7:
                        return;
            }            

        }         

	}
	   private static void registrarCursoss(ICurso lCurso) {
	        Scanner oScanner = new Scanner(System.in);
	        Curso ocurso = new Curso();
	        
	        System.out.println(" Ingresar el Codigo del Curso ");
	        ocurso.setNombCurso(oScanner.nextLine());
	        
	        System.out.println(" Ingresar Descripcion ");
	        ocurso.setDescripcion(oScanner.nextLine());
	        
	        System.out.println(" Ingresar Precio ");
	        ocurso.setPrecio(oScanner.nextLine());
	    
	        System.out.println(lCurso.insertar(ocurso));
	        System.out.println("Presionar tecla para continuar");
	        oScanner.nextLine();
	    }

	    private static void listarCursoss(ICurso lCurso) {
	        Scanner oScanner = new Scanner(System.in);
	        for (int i = 0; i < lCurso.contar() ; i++) {
	            Curso oCurso = lCurso.obtenerElemento(i);
	            System.out.println(oCurso.getNombCurso()+" "+oCurso.getDescripcion()+" "+oCurso.getPrecio());
	        }
	        System.out.println("Presiona tecla");
	        oScanner.nextLine();
	    }

	    private static void registrarFormaPagoss(IFormaPago lFormaPago) {
	        Scanner oScanner = new Scanner(System.in);
	        FormaPago oformapago = new FormaPago();
	        
	        System.out.println(" Ingresar el Tipo de Forma de Pago ");
	        oformapago.setNombPago(oScanner.nextLine());
	        
	        System.out.println(" Ingresar Descripcion ");
	        oformapago.setDescripcion(oScanner.nextLine());
	        
	        System.out.println(lFormaPago.insertar(oformapago));
	        System.out.println("Presionar tecla para continuar");
	        oScanner.nextLine();
	    }

	    private static void listarFormaPagoss(IFormaPago lFormaPago) {
	        Scanner oScanner = new Scanner(System.in);
	        for (int i = 0; i < lFormaPago.contar() ; i++) {
	            FormaPago oFormaPago = lFormaPago.obtenerElemento(i);
	            System.out.println(oFormaPago.getNombPago()+" "+oFormaPago.getDescripcion());
	                    
	        }
	        System.out.println("Presiona tecla");
	        oScanner.nextLine();
	    }

	    private static void registrarInsripcion(ICurso lCurso, IFormaPago lFormaPago, IInscripcion lInscripcion) {
	        Inscripcion oInscripcion = new Inscripcion();
	        Scanner oScanner = new Scanner(System.in);
	        
	        while(true){    
	        
	        System.out.println("Ingree Codigo de Curso");
	        Curso oCurso = lCurso.buscarCurso(oScanner.nextLine());
	            if (oCurso!=null) {
	                oInscripcion.setoCurso(oCurso);
	                break;
	            }else{
	                System.out.println("Ingrese Curso Valido (registrado previamente)puesss");
	            }
	        }

	        while(true){            
	        
	        System.out.println("Ingrese Forma de Pago");       
	        FormaPago oFormaPago= lFormaPago.buscarPAgo(oScanner.nextLine());
	            if (oFormaPago!=null) {
	                oInscripcion.setoFormaPago(oFormaPago);
	                break;
	            }else{
	                System.out.println("Ingresar Forma de Pago Registrada");
	            }  
	        }
	        
	        System.out.println("Ingrese Codigo Inscripcion");
	        oInscripcion.setNombInscripcion(oScanner.nextLine());
	        
	        System.out.println("Ingrese Nombre Alumno");
	        oInscripcion.setNombAlumno(oScanner.nextLine());
	        
	        System.out.println("Ingrese Telefono");
	        oInscripcion.setTelefono(oScanner.nextLine());
	        
	        System.out.println(lInscripcion.insertar(oInscripcion));
	        
	        System.out.println("Presione una tecla");
	        oScanner.nextLine();
	         
	    }

	    private static void listarPersonas(IInscripcion lInscripcion) {
	        Scanner oScanner =  new Scanner(System.in);
	        
	        for (int i = 0; i < lInscripcion.contar(); i++) {
	            Inscripcion oInscripcion = lInscripcion.obtenerElemento(i);
	            System.out.println(
	                    oInscripcion.getNombInscripcion()+" "+
	                    oInscripcion.getNombAlumno()+" "+                    
	                    oInscripcion.getoCurso().getNombCurso()+" "+         
	                    oInscripcion.getoCurso().getDescripcion()+" "+
	                    oInscripcion.getoFormaPago().getNombPago());                
	        }
	        System.out.println("Presionas tecla");
	        oScanner.nextLine(); 
	    }

}
