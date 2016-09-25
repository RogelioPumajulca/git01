package pe.edu.upc.model.entity;

public class Persona {

	private String DNI;
	private String Nombre;
	private String Genero;
	
	private Grupo oGrupo; //Ref a la clase grupo. En BD sería una FK (clase foranea)
	
	public Grupo getoGrupo() {
		return oGrupo;
	}

	public void setoGrupo(Grupo oGrupo) {
		this.oGrupo = oGrupo;
	}

	public Persona() {
		super();
	}

	public String getDNI() {
		return DNI;
	}

	
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}


}
