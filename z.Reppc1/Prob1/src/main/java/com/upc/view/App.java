package com.upc.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.upc.dao.gestorautor;
import com.upc.dao.gestoreditorial;
import com.upc.dao.gestormaterialconsulta;
import com.upc.dao.gestortema;
import com.upc.dao.gestorusuario;
import com.upc.entity.autor;
import com.upc.entity.editorial;
import com.upc.entity.materialconsulta;
import com.upc.entity.tema;
import com.upc.entity.usuario;
import com.upc.service.Iautor;
import com.upc.service.Ieditorial;
import com.upc.service.Imaterialconsulta;
import com.upc.service.Itema;
import com.upc.service.Iusuario;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )
    {
        //System.out.println( "  " );
/* INI MENUUUUUUUUUUUUU
        Scanner leer = new Scanner("System.in");
        int opcion=100;
 while(opcion!=0){        
        System.out.println("Ingrese opcion: ");
        System.out.println(
        "1.-Ingresar usuario \n 2.-Ingresar Autor: \n 3.-Ingre. Editorial"
        + "\n 4.-Ingresa Tema \n 5.-Ingresa Solicitud Prest \n 6.-Listar A "
        + "\n 0.- salir");
        opcion = leer.nextInt();      
        switch (opcion) {
		case 1:
			registrarusuario();
			break;
		case 2:
			registrarautor();
			break;
		case 3:
			registrareditorial();
			break;
		case 4:
			registraretema();
			break;
		case 5:
			registrarsolicitud();
			break;
		case 0: return;	
		default:
			break;
		}
 } 
        
FIN MENUUUUUUUUUUUUU */

		
//////////todo USUARIO USUARIO        
        
        Iusuario iu = new gestorusuario() ;
        usuario u0 = new usuario("nombreUSU0", "identifi0", "id0", "categoUSU0", "direcc0", "123456", "hoy1");;
        usuario u1 = new usuario("nombreUSU1", "identifi1", "id1", "categoUSU1", "direcc1", "123456", "hoy1");;
        usuario u2 = new usuario("nombreUSU2", "identifi2", "id2", "categoUSU2", "direcc2", "123456", "hoy2");;
      
        iu.agregarelemento(u0);
        iu.agregarelemento(u1);
        iu.agregarelemento(u2);
        iu.listarelementos();
            
        usuario ubu = iu.buscarusuario("id0");
        System.out.println("\nUSUARIO BUSCADO "+ubu.getNombre()+" "+ubu.getId()+" "+ubu.getDireccion()+"\n");
        
        iu.eliminarelemento(2);
        iu.listarelementos();
        
        iu.modificarelemento(0, "modinom0", "modiDirec0");
        iu.listarelementos();
		
///////todo AUTOR AUTOR
     
        Iautor ia = new gestorautor();
        autor a0= new autor("idau0", "nombAut0", "nacioaut0");
        autor a1= new autor("idau1", "nombAut1", "nacioaut1");
        autor a2= new autor("idau2", "nombAut2", "nacioaut2");
  
        ia.agregarelemento(a0);
        ia.agregarelemento(a1);
        ia.agregarelemento(a2);
        ia.listarelementos();
        
        autor a= ia.buscarautor("idau0");
        System.out.println("buscado: "+a.getId()+" "+a.getNombre()+" "+a.getNacionalidad()+"\n");
        
        ia.eliminarelemento(2);
        ia.listarelementos();
        
        ia.modificarelemento(0, "modiNomAut0", "modiDireccAut0");
        ia.listarelementos();
        
///////todo EDITORIAL EDITORIAL
       
        Ieditorial ie = new gestoreditorial();
        editorial edi0 = new editorial("idedit0", "nombEdi0", "direcEdit0", "telefEdit0");
        editorial edi1 = new editorial("idedit1", "nombEdi1", "direcEdit1", "telefEdit1");
        editorial edi2 = new editorial("idedit2", "nombEdi2", "direcEdit2", "telefEdit2");

        ie.agregarelemento(edi0);
        ie.agregarelemento(edi1);
        ie.agregarelemento(edi2);
        ie.listarelementos();
        
        editorial e = ie.buscareditorial("idedit0");
        System.out.println("buscado: "+e.getId()+" "+e.getNombre()+" "+e.getDireccion()+"\n");
        
        ie.eliminarelemento(2);
        ie.listarelementos();
        
        ie.modificarelemento(0, "MODInomEdit0", "MODIdirecEdit0");
        ie.listarelementos();
 
///////todo TEMA TEMA
 
        Itema it = new gestortema();
        tema t0= new tema("idTem0", "nombTem0");
        tema t1= new tema("idTem1", "nombTem1");
        tema t2= new tema("idTem2", "nombTem2");

        it.agregarelemento(t0);
        it.agregarelemento(t1);
        it.agregarelemento(t2);
        it.listarelementos();
        
        tema t = it.buscartema("idTem0");
        System.out.println("buscado: "+t.getId()+" "+t.getNombre()+"\n");
        
        it.eliminarelemento(2);
        it.listarelementos();
        
        it.modificarelemento(0, "MODInombTem0", "nada");
        it.listarelementos();
        
        
///////todo MATERIAL CONSULTA        
     
        Imaterialconsulta imc = new gestormaterialconsulta();
        materialconsulta mc0=new materialconsulta("idMC0", "tiMC0", edi0, a0, t0, "fechaMC0", "catMC0", "idiomMC0");
        materialconsulta mc1=new materialconsulta("idMC1", "tiMC1", edi1, a1, t1, "fechaMC1", "catMC1", "idiomMC1");
        materialconsulta mc2=new materialconsulta("idMC2", "tiMC2", edi2, a2, t2, "fechaMC2", "catMC2", "idiomMC2");
        imc.agregarelemento(mc0);
        imc.agregarelemento(mc1);
        imc.agregarelemento(mc2);
        imc.listarelementos();
        
        materialconsulta m = imc.buscarmaterial("idMC0");
        System.out.println("buscado: "+m.getId()+" "+m.getTitulo()+" "+m.getA().getNombre()+"\n");
        
        imc.eliminarelemento(2);
        imc.listarelementos();
        
        imc.modificarelemento(0, "MODIFtiMC0", "MODIfechaMC0");
        imc.listarelementos();
    }


/*
	private static void registrarsolicitud() {
		// TODO Auto-generated method stub
        Imaterialconsulta imc = new gestormaterialconsulta();
        materialconsulta mc0=new materialconsulta("idMC0", "tiMC0", edi0, a0, t0, "fechaMC0", "catMC0", "idiomMC0");
        materialconsulta mc1=new materialconsulta("idMC1", "tiMC1", edi1, a1, t1, "fechaMC1", "catMC1", "idiomMC1");
        materialconsulta mc2=new materialconsulta("idMC2", "tiMC2", edi2, a2, t2, "fechaMC2", "catMC2", "idiomMC2");
        imc.agregarelemento(mc0);
        imc.agregarelemento(mc1);
        imc.agregarelemento(mc2);
        imc.listarelementos();
	}



	private static void registraretema(Itema it) {
		// TODO Auto-generated method stub
      //  Itema it = new gestortema();
        tema t0= new tema("idTem0", "nombTem0");
        tema t1= new tema("idTem1", "nombTem1");
        tema t2= new tema("idTem2", "nombTem2");

        it.agregarelemento(t0);
        it.agregarelemento(t1);
        it.agregarelemento(t2);
        it.listarelementos();
	}



	private static void registrareditorial() {
		// TODO Auto-generated method stub
		Ieditorial ie = new gestoreditorial();
        editorial edi0 = new editorial("idedit0", "nombEdi0", "direcEdit0", "telefEdit0");
        editorial edi1 = new editorial("idedit1", "nombEdi1", "direcEdit1", "telefEdit1");
        editorial edi2 = new editorial("idedit2", "nombEdi2", "direcEdit2", "telefEdit2");

        ie.agregarelemento(edi0);
        ie.agregarelemento(edi1);
        ie.agregarelemento(edi2);
        ie.listarelementos();
	}



	private static void registrarautor() {
		// TODO Auto-generated method stub
		Iautor ia = new gestorautor();
        autor a0= new autor("idau0", "nombAut0", "nacioaut0");
        autor a1= new autor("idau1", "nombAut1", "nacioaut1");
        autor a2= new autor("idau2", "nombAut2", "nacioaut2");
  
        ia.agregarelemento(a0);
        ia.agregarelemento(a1);
        ia.agregarelemento(a2);
        ia.listarelementos();
	}
	
	private static void registrarusuario() {
		// TODO Auto-generated method stub
        Iusuario iu = new gestorusuario() ;
        usuario u0 = new usuario("nombre0", "identifi0", "id0", "catego0", "direcc0", "123456", "hoy1");;
        usuario u1 = new usuario("nombre1", "identifi1", "id1", "catego1", "direcc1", "123456", "hoy1");;
        usuario u2 = new usuario("nombre2", "identifi2", "id2", "catego2", "direcc2", "123456", "hoy2");;
      
        iu.agregarelemento(u0);
        iu.agregarelemento(u1);
        iu.agregarelemento(u2);
        iu.listarelementos();
	}
*/	
}
