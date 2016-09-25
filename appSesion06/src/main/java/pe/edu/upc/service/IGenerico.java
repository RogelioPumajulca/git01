package pe.edu.upc.service;

//Interfaz IGenerico donde se definen los requerimientos
//que son comunes a todas las clases ( ListaGrupo y ListaPersona )
public interface IGenerico<T> {
	 int contar();
	 T obtenerElemento(int pos);
	
	 String insertar(T o);
}

