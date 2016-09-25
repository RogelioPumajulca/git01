package services;

import model.entity.Curso;

public interface ICurso extends IGenerico<Curso>{
	Curso buscarCurso(String nombCurso);
}
