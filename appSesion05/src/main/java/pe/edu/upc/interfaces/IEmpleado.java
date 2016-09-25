package pe.edu.upc.interfaces;

import pe.edu.upc.entity.Empleado;

public interface IEmpleado extends IGenerico<Empleado> {

	Empleado getByNeoSegSocial(String nss); //Dato propio del empleado
	
}


