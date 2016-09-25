package com.upc.view;

import java.util.List;
import java.util.Scanner;

import com.upc.dao.gestordep;
import com.upc.dao.gestoremp;
import com.upc.dao.gestorpro;
import com.upc.dao.gestortar;
import com.upc.entity.departamento;
import com.upc.entity.empleado;
import com.upc.entity.proyecto;
import com.upc.entity.tarea;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	gestordep ldep = new gestordep();
    	departamento dep1 = new departamento(),dep2=new departamento(),dep3=new departamento();
    	dep1.setCodigo(1);dep1.setNombre("departamento1");dep1.setLocalizacion("lima centro");
    	ldep.agregaldep(dep1);
    	dep2.setCodigo(2);dep2.setNombre("departamento2");dep2.setLocalizacion("lima oeste");
    	ldep.agregaldep(dep2);
    	
    	gestoremp lemp=new gestoremp();
    	empleado emp1 = new empleado(),emp2= new empleado(),emp3= new empleado(),emp4= new empleado();
    	emp1.setCodigo(1);emp1.setNombre("empleado1");emp1.setSueldo(101);emp1.setDepa(dep1);
    	lemp.agregarlemp(emp1);
    	emp2.setCodigo(2);emp2.setNombre("empleado2");emp2.setSueldo(102);emp2.setDepa(dep1);
    	lemp.agregarlemp(emp2);
    	emp3.setCodigo(3);emp3.setNombre("empleado3");emp3.setSueldo(103);emp3.setDepa(dep2);
    	lemp.agregarlemp(emp3);
    	emp4.setCodigo(4);emp4.setNombre("empleado4");emp4.setSueldo(104);emp4.setDepa(dep2);
    	lemp.agregarlemp(emp4);

    	gestorpro lpro=new gestorpro();
    	proyecto pro1= new proyecto(),pro2=new proyecto(),pro3=new proyecto(),pro4=new proyecto();
    	pro1.setCodigo(1);pro1.setMaxhoras(41);pro1.setNombre("proeycto1");
    	lpro.agregarlpro(pro1);
    	pro2.setCodigo(2);pro2.setMaxhoras(42);pro2.setNombre("proeycto2");
    	lpro.agregarlpro(pro2);
    	pro3.setCodigo(3);pro3.setMaxhoras(43);pro3.setNombre("proeycto3");
    	lpro.agregarlpro(pro3);
    	pro4.setCodigo(4);pro4.setMaxhoras(44);pro4.setNombre("proeycto4");
    	lpro.agregarlpro(pro4);
    	
    	gestortar ltar=new gestortar();
    	tarea tar1=new tarea(),tar2=new tarea(),tar3=new tarea(),tar4=new tarea(),tar5=new tarea(),tar6=new tarea();
    	tar1.setDescripcion("programar1");tar1.setFecha("hoy");tar1.setHora(1);tar1.setEmp(emp1);tar1.setPro(pro1);
    	ltar.agregarltar(tar1);
    	tar2.setDescripcion("programar2");tar1.setFecha("hoy2");tar1.setHora(2);tar2.setEmp(emp1);tar2.setPro(pro2);
    	ltar.agregarltar(tar2);
    	tar3.setDescripcion("programar3");tar1.setFecha("hoy3");tar1.setHora(3);tar3.setEmp(emp2);tar3.setPro(pro3);
    	ltar.agregarltar(tar3);
    	tar4.setDescripcion("programar4");tar1.setFecha("hoy4");tar1.setHora(4);tar4.setEmp(emp1);tar4.setPro(pro4);
    	ltar.agregarltar(tar4);
    	tar5.setDescripcion("programar5");tar1.setFecha("hoy5");tar1.setHora(5);tar5.setEmp(emp3);tar5.setPro(pro1);
    	ltar.agregarltar(tar5);
    	tar6.setDescripcion("programar6");tar1.setFecha("hoy6");tar1.setHora(6);tar6.setEmp(emp4);tar6.setPro(pro2);    	
    	ltar.agregarltar(tar6);

    	
    	System.out.println("la lista es la siguiente");
    	
    	List<tarea> ltt=ltar.listarltar();
    	for (tarea tarea : ltt) {
			 System.out.println(" la tarea: "+tarea.getDescripcion()+" ||por el empleado: "
					 			+tarea.getEmp().getNombre()+" ||del proyecto "+
					 			tarea.getPro().getNombre()+" ||del depart: "+tarea.getEmp().getDepa().getNombre());
		}

    	Scanner lee =new Scanner(System.in);
    	lee.nextLine();
  	
    	
    }
}
