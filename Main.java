public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("ABC123", "Mario", "Rossi", "123456", "Università di Bologna");
        Docente docente = new Docente("DEF456", "Luca", "Bianchi", "Matematica", "€2000");
        System.out.println(studente);
        System.out.println(docente);
    }
}