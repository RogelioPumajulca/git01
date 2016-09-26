package com.upc.view;

import java.util.List;

import com.upc.dao.gestordepartamento;
import com.upc.dao.gestorempleado;
import com.upc.dao.gestorproyecto;
import com.upc.dao.gestortarea;
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
       // System.out.println("  ");
    	
    	departamento dep1 = new departamento(1, "dep1", "local1");
    	departamento dep2 = new departamento(2, "dep2", "local2");
    	departamento dep3 = new departamento(3, "dep3", "local3");
    	gestordepartamento gd = new gestordepartamento();
    	gd.agregardepa(dep1);gd.agregardepa(dep2);gd.agregardepa(dep3);
    	
    	empleado emp1 = new empleado(1, "emp1", 100, dep1);
    	empleado emp2 = new empleado(2, "emp2", 200, dep1);
    	empleado emp3 = new empleado(3, "emp3", 300, dep2);
    	empleado emp4 = new empleado(4, "emp3", 400, dep3);
    	gestorempleado ge = new gestorempleado();
    	ge.agregarempl(emp1);ge.agregarempl(emp2);ge.agregarempl(emp3);ge.agregarempl(emp4);
    	
    	proyecto pro1 = new proyecto(1, "proy1", 10);
    	proyecto pro2 = new proyecto(2, "proy2", 20);
    	proyecto pro3 = new proyecto(3, "proy3", 30);
    	proyecto pro4 = new proyecto(4, "proy4", 40);
    	gestorproyecto gp = new gestorproyecto();
    	gp.agregarpro(pro1);gp.agregarpro(pro2);gp.agregarpro(pro3);gp.agregarpro(pro4);

    	tarea tar1 = new tarea("hoy1", 1, "tarea1", emp1, pro1);
    	tarea tar2 = new tarea("hoy2", 2, "tarea2", emp1, pro1);
    	tarea tar3 = new tarea("hoy3", 3, "tarea3", emp2, pro1);
    	tarea tar4 = new tarea("hoy4", 4, "tarea4", emp3, pro2);
    	tarea tar5 = new tarea("hoy5", 5, "tarea5", emp4, pro3);
    	gestortarea gt = new gestortarea();
    	gt.agregartar(tar1);gt.agregartar(tar2);gt.agregartar(tar3);gt.agregartar(tar4);gt.agregartar(tar5);
    	
    	///listando todo
    	List<tarea> lt = gt.devolvelisttar();
    	
    	for (tarea tarea : lt) {
        	System.out.println(" La tarea: "+tarea.getDescripcion()+" del proyecto: "+tarea.getProyecto().getNombre()+
        			" empleado"+tarea.getEmpleado().getNombre()+" departamento: "+tarea.getEmpleado().getDepartamento().getNombre());
		}
    	
    	//System.out.println("  ");
    }
}
