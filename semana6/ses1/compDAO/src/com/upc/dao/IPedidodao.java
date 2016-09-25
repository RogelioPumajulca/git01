package com.upc.dao;

import java.sql.SQLException;
import java.util.List;

import com.upc.dto.Pedido;
import com.upc.dto.Usuario;

public interface IPedidodao extends ICruddao<Pedido>, IRowmapper<Pedido>{
    List<Pedido> getAllPedidosByUsuario(Usuario u) throws SQLException;    
    List<Pedido> getAllPedidosByFecha(String fechapedido)throws SQLException;
}

