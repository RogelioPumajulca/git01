package com.upc.service;

import com.upc.entity.materialconsulta;
import com.upc.entity.usuario;

public interface Imaterialconsulta extends Igenerica<materialconsulta>{

	materialconsulta buscarmaterial(String id);
	public void solicitar();
}
