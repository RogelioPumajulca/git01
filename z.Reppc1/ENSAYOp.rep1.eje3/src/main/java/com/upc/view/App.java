package com.upc.view;

import java.util.ArrayList;
import java.util.List;

import com.upc.dao.gestorshape;
import com.upc.entity.rectangle;
import com.upc.entity.shape;
import com.upc.entity.triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//System.out.println( "Hello World!" );
    	
    	gestorshape gs=new gestorshape();
    	shape sr1 = new rectangle("rojo1",3,4);
    	shape sr2 = new rectangle("rojo2",4,5);
    	shape sr3 = new rectangle("rojo3",5,6);
    	gs.agregarshape(sr1);gs.agregarshape(sr2);gs.agregarshape(sr3);
    	
    	
    	shape st1 = new triangle("verde1",7,8);
    	shape st2 = new triangle("verde2",8,9);
    	shape st3 = new triangle("verde3",9,10);
    	gs.agregarshape(st1);gs.agregarshape(st2);gs.agregarshape(st3);
    	
    	List<shape> listshap = new ArrayList<shape>();
    	listshap = gs.listarshape();
    	
    	for (shape shape : listshap) {
			if (shape instanceof rectangle) {
				System.out.println(" ||Principal RECTANGLE: "+shape.toString());shape.moveleft();
			}else{
				System.out.println(" ||Principal TRIANGLE: "+shape.toString());shape.moveright();
			}
		}
    	
    	
    }
}
