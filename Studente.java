public class Studente extends Persona{
    private String Matricola;
    private String University;
    public Studente(String CodiceFiscale, String Nome, String Cognome, String Matricola, String University) {
        super(CodiceFiscale, Nome, Cognome);
        this.Matricola = Matricola;
        this.University = University;
    }
    public String getMatricola() {return Matricola;}
    public String getUniversity() {return University;}
    public void setMatricola(String Matricola) {this.Matricola = Matricola;}
    public void setUniversity(String University) {this.University = University;}

    public String toString() {return super.toString() + Matricola + University;}
}
