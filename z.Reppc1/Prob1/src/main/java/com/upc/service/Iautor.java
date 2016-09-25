package com.upc.service;

import com.upc.entity.autor;

public interface Iautor extends Igenerica<autor>{

	autor buscarautor(String id);
}
