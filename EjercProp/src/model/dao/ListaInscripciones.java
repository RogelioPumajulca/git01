package model.dao;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import model.entity.Inscripcion;
import services.IInscripcion;

public class ListaInscripciones implements IInscripcion {
    List<Inscripcion> lInscripcion;

    
    
    public ListaInscripciones() {
        lInscripcion = new ArrayList<Inscripcion>();
    }

    public List<Inscripcion> getlInscripcion() {
        return lInscripcion;
    }

    public void setlInscripcion(List<Inscripcion> lInscripcion) {
        this.lInscripcion = lInscripcion;
    }

    @Override
    public Inscripcion buscarInscripcion(String nombInscripcion) {
        for (Inscripcion inscripcion : lInscripcion) {
            if (inscripcion.getNombInscripcion().equals(nombInscripcion)) {
                return inscripcion;
            }
        }
        return null;
    }

    @Override
    public int contar() {
        return lInscripcion.size();
    }

    @Override
    public Inscripcion obtenerElemento(int pos) {
        return lInscripcion.get(pos);
    }

    @Override
    public String insertar(Inscripcion o) {
        lInscripcion.add(o);
        return" Inserto Inscripcion ";
    }
    
    
}
