package pe.edu.upc.interfaces;

import pe.edu.upc.entity.Factura;

public interface IFactura  extends IGenerico<Factura>{

	Factura GetByNroFac(String nroFact);
	
}
