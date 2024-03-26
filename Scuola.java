import java.util.ArrayList;

public class Scuola {
    private ArrayList<Persona> Persone;
    public Scuola() {
        Persone = new ArrayList<Persona>();
    }
    public void addPersona(Persona persona) {
        Persone.add(persona);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Persona persona : Persone) {
          sb.append(persona.toString()).append("\n");
        }
        return sb.toString();
    }
}

