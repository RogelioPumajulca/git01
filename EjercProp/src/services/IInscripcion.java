package services;

import model.entity.Inscripcion;

public interface IInscripcion extends IGenerico<Inscripcion>{
	Inscripcion buscarInscripcion(String nombInscripcion);
}
