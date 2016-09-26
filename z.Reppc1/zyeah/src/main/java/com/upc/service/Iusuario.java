package com.upc.service;

import com.upc.entity.usuario;

public interface Iusuario extends Igenerica<usuario>{

	usuario buscarusuario(String id);
}
