package pe.edu.upc.service;

import pe.edu.upc.model.entity.Grupo;

//Interface  IGrupo que hereda de la interfaz IGenerico
//Se define los requerimientos funcionales que son propios de grupo
public interface IGrupo extends IGenerico<Grupo>{
	 Grupo buscarPorNroGrupo(String nroGrupo);
}

