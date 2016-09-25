package pe.edu.upc.interfaces;

//se le conoce como CONTRATO, donde se definen los metodos que un conjunto de clases implementaran

public interface PorPagar {
	
	//static es global
	//final: valor fijo
	
	static final double IGV=0.18;
	double calcularPago();
	
	
	
}
