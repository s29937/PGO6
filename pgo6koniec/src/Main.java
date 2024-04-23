import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student kandydat = new Student("Jan", "Kowalski", "1998-05-15", "jan.kowalski@example.com", "ul. Krakowska 1, Warszawa", Status.KANDYDAT);
        ProgramStudiow informatyka = new ProgramStudiow("Informatyka", "Opis programu studiów informatyki");
        kandydat.addProgram(informatyka);
        Semestr pierwszySemestr = new Semestr(1);


        System.out.println("Imię: " + kandydat.getFirstName());
        System.out.println("Nazwisko: " + kandydat.getLastName());
        System.out.println("Numer indeksu: s" + kandydat.getStudentNumber());
        System.out.println("Status: " + kandydat.getStatus());
        System.out.println("Program studiów: " + kandydat.getPrograms().get(0).getProgramName());
        System.out.println("Opis programu studiów: " + kandydat.getPrograms().get(0).getProgramDescription());
    }
}
