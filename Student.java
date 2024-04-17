import java.util.ArrayList;
import java.util.Date;


public class Student {
    protected String name;
    protected String lastname;
    protected String email;
    protected String adress;
    protected String telephonenumber;
    protected String snumber;
    protected Date date;
    protected ArrayList<String>grades;

    public Student(String name, String lastname, String email, String adress, String telephonenumber, Date date) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.adress = adress;
        this.telephonenumber = telephonenumber;
        this.snumber = snumber;
        this.date = date;

    }
    public String getname() {
        return name;
    }
    public String getlastname() {
        return lastname;
    }
    public String getemail() {
        return email;
    }
    public String getadress() {
        return adress;
    }
    public  String getsnumber() {
        return snumber;
    }
    public  String gettelephonenumber() {
        return telephonenumber;
    }
    public Date getdate() {
        return date;
    }
}
