package pe.edu.upc.service;

import pe.edu.upc.model.entity.Persona;

//Interface  IPersona que hereda de la interfaz IGenerico
//Se define los requerimientos funcionales que son propios de persona
public interface IPersona extends IGenerico<Persona> {
	 Persona buscarporDNI(String DNI);

}

