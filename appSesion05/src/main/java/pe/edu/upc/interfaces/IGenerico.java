package pe.edu.upc.interfaces;

import java.util.List;

//tipo de dato generico
public interface IGenerico <T> {

	
	String Insert(T o);
	String Update (T o);
	String Delete (int id); 
	T get (int index); //Retorna objetos segun indice
	List<T> getAll();
	int count();
	
	
}
