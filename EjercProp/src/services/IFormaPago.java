package services;

import model.entity.FormaPago;

public interface IFormaPago extends IGenerico<FormaPago> {
	FormaPago buscarPAgo(String nombPago);
}
