package pe.edu.upc.entity;
// La clase Factura implementa a PorPagar.
import java.util.List;
import pe.edu.upc.interfaces.IFactura;
//import pe.edu.upc.interfaces.Metodos;
import pe.edu.upc.interfaces.PorPagar;

public class Factura implements IFactura, PorPagar{
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;

	// constructor con cuatro argumentos
	public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
		this.numeroPieza = numeroPieza;
		this.descripcionPieza = descripcionPieza;
		setCantidad(cantidad); // valida y almacena la cantidad
		setPrecioPorArticulo(precioPorArticulo); // valida y almacena el precio
													// por art�culo
	}

	// establece el numero de pieza
	public void setNumeroPieza(String pieza) {
		this.numeroPieza = pieza;
	}

	// obtiene el numero de pieza
	public String getNumeroPieza() {
		return this.numeroPieza;
	}

	// establece la descripcion
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

	// obtiene la descripcion
	public String getDescripcionPieza() {
		return this.descripcionPieza;
	}

	// establece la cantidad
	public void setCantidad(int cantidad) {
		if (cantidad >= 0)
			this.cantidad = cantidad;
		else
			throw new IllegalArgumentException("Cantidad debe ser >= 0");
	}

	// obtener cantidad
	public int getCantidad() {
		return this.cantidad;
	}

	// establece el precio por articulo
	public void setPrecioPorArticulo(double precioPorArticulo) {
		if (precioPorArticulo >= 0.0)
			this.precioPorArticulo = precioPorArticulo;
		else
			throw new IllegalArgumentException("El precio por articulo debe ser >= 0");
	}

	// obtiene el precio por articulo
	public double getPrecioPorArticulo() {
		return this.precioPorArticulo;
	}

	// devuelve representacion String de un objeto Factura
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "factura", "numero de pieza", getNumeroPieza(),
				getDescripcionPieza(), "cantidad", getCantidad(), "precio por articulo", getPrecioPorArticulo());
	}

	@Override
	public String Insert(Factura o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Update(Factura o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Factura> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPago() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Factura GetByNroFac(String nroFact) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

} // fin de la clase Factura
