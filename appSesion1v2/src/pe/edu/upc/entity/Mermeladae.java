package pe.edu.upc.entity;

public class Mermeladae extends Frutae { //extends se usa par HERENCIA

	
	protected int tiempoPreparacion;  //protec es para que las clases hijas tengan acceso al dato protegido y puede estar en otro paquete
	protected String tipoEnvase;    //private solo puede acceder los que estan en el mismo paquete
	
	//esto sale por un error en MERMELADAE
	public Mermeladae(String color, String sabor,int tiempo, String tipoEnvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		
		this.tiempoPreparacion=tiempoPreparacion;
		this.tipoEnvase=tipoEnvase;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	


}
