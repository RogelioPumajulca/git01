package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.entity.Curso;
import services.ICurso;

public class ListaCursos implements ICurso {
    List<Curso> lCurso;

    public ListaCursos() {
        lCurso = new ArrayList<Curso>();
    }

    public List<Curso> getlCurso() {
        return lCurso;
    }

    public void setlCurso(List<Curso> lCurso) {
        this.lCurso = lCurso;
    }

    @Override
    public Curso buscarCurso(String nombCurso) {
        for (Curso curso : lCurso) {
            if (curso.getNombCurso().equals(nombCurso)) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public int contar() {
        return lCurso.size();
    }

    @Override
    public Curso obtenerElemento(int pos) {
        return lCurso.get(pos);
    }

    @Override
    public String insertar(Curso o) {
        lCurso.add(o);
        return " Se incerto curso ";
    }
    
}
