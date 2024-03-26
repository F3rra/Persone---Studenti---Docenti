public class Docente extends Persona{
    private String Materia;
    private String Salario;
    public Docente(String CodiceFiscale, String Nome, String Cognome, String Materia, String Salario) {
        super(CodiceFiscale, Nome, Cognome);
        this.Materia = Materia;
        this.Salario = Salario;
    }
    public String getMateria() {return Materia;}
    public String getSalario() {return Salario;}
    public void setMateria(String Materia) {this.Materia = Materia;}
    public void setSalario(String Salario) {this.Salario = Salario;}
    public String toString() {return super.toString() + Materia + Salario;}
}
