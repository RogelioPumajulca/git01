package com.upc.view;

import com.upc.dao.gestorusuario;
import com.upc.entity.usuario;
import com.upc.service.Iusuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	usuario usu0= new usuario("nombre0", "id0", "apellid0");
    	usuario usu1= new usuario("nombre1", "id1", "apellid1");
    	
    	Iusuario iu = new gestorusuario();
    	iu.agregarelemento(usu0);iu.agregarelemento(usu1);
    	
    	usuario u0 = iu.obtenerelemento(0);
    	usuario u1 = iu.obtenerelemento(1);
    	
    	System.out.println("usuario: "+u0.getNombre()+" "+u0.getId());

    	System.out.println("usuario: "+u1.getNombre()+" "+u1.getId());
    }
}
