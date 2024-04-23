import java.util.ArrayList;
import java.util.List;

class Student {
    private static int nextStudentNumber = 1;
    private int studentNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String address;
    private Status status;
    private List<ProgramStudiow> programs = new ArrayList<>();

    public Student(String firstName, String lastName, String dateOfBirth, String email, String address, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.status = status;
        this.studentNumber = nextStudentNumber++;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Status getStatus() {
        return status;
    }

    public List<ProgramStudiow> getPrograms() {
        return programs;
    }

    public void addProgram(ProgramStudiow program) {
        programs.add(program);
    }
}
