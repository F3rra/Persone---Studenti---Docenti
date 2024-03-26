public class Persona {
    private String CodiceFiscale;
    private String Nome;
    private String Cognome;
    public Persona(String CodiceFiscale, String Nome, String Cognome){
        this.CodiceFiscale = CodiceFiscale;
        this.Nome = Nome;
        this.Cognome = Cognome;
    }
    public String getCodiceFiscale() {return CodiceFiscale;}
    public String getNome() {return Nome;}
    public String getCognome() {return Cognome;}
    public void setCodiceFiscale(String CodiceFiscale) {this.CodiceFiscale = CodiceFiscale;}
    public void setNome(String Nome) {this.Nome = Nome;}
    public void setCognome(String Cognome) {this.Cognome = Cognome;}

    public String toString() {
        return CodiceFiscale + Nome + Cognome;
    }
}
