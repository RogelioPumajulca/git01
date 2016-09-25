package pe.edu.upc.model.entity;

public class Grupo {

	private String NroGrupo;
    private String Colegio;
    private String CodUbigeo;
    
    public Grupo(){}
    
    public void setNroGrupo(String NroGrupo) {this.NroGrupo = NroGrupo;}
    public void setColegio(String Colegio) {this.Colegio = Colegio;}
    public void setCodUbigeo(String CodUbigeo) {this.CodUbigeo = CodUbigeo;}
    
    public String getNroGrupo(){return this.NroGrupo;}
    public String getColegio(){return this.Colegio;}
    public String getCodUbigeo(){return this.CodUbigeo;}
    
    
}
