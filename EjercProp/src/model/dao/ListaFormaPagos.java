package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.entity.FormaPago;
import services.IFormaPago;


public class ListaFormaPagos implements IFormaPago{
    List<FormaPago> lFormaPAgo;

    public ListaFormaPagos() {
        lFormaPAgo = new ArrayList<FormaPago>();
    }

    public List<FormaPago> getlFormaPAgo() {
        return lFormaPAgo;
    }

    public void setlFormaPAgo(List<FormaPago> lFormaPAgo) {
        this.lFormaPAgo = lFormaPAgo;
    }

    @Override
    public FormaPago buscarPAgo(String nombPago) {
        for (FormaPago formaPago : lFormaPAgo) {
            if (formaPago.getNombPago().equals(nombPago)) {
                return formaPago;
            }
        }
        return null;
    }

    @Override
    public int contar() {
        return lFormaPAgo.size();
    }

    @Override
    public FormaPago obtenerElemento(int pos) {
        return lFormaPAgo.get(pos);
    }

    @Override
    public String insertar(FormaPago o) {
        lFormaPAgo.add(o);
        return "Se incerto PAago";
    }
    
 
}
