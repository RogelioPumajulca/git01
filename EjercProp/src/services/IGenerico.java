package services;

public interface IGenerico<T>{
	int contar();
    T obtenerElemento(int pos);
    String insertar(T o);
}
