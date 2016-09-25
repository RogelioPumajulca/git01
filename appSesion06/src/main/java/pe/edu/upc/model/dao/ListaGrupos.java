package pe.edu.upc.model.dao;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.model.entity.Grupo;
import pe.edu.upc.service.IGrupo;

public class ListaGrupos implements IGrupo {

	private List<Grupo> lGrupo=null;

	public ListaGrupos() {
		lGrupo = new ArrayList<Grupo>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return lGrupo.size();
	}

	public Grupo obtenerElemento(int pos) {
		// TODO Auto-generated method stub
		return lGrupo.get(pos);
	}

	public Grupo buscarPorNroGrupo(String nroGrupo) {
		// TODO Auto-generated method stub
		for (Grupo grupo : lGrupo) {
			if(grupo.getNroGrupo().equals(nroGrupo))
				return grupo;
		}
		return null;
	}
	
	public String insertar(Grupo o) {
		// TODO Auto-generated method stub
		if(buscarPorNroGrupo(o.getNroGrupo())==null){
			lGrupo.add(o);
			return "Registrado exitosamente";
		}else{
			return "Codigo de grupo ya existe";
		}
		
	}

	

}
