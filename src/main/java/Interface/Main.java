package Interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Management management = new Management();
        student.setName("janhvi");
        student.setLastname("joshi");
        student.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2022"));
        teacher.setName("nikunj");
        teacher.setLastname("lastname");
        teacher.setPosition("lecturer");
        management.setName("Timber");
        management.setLastname("hills");
        management.setType("leasing office");

        System.out.println("Student Information---->" + student.userDetails());
        System.out.println("teacher Information---->" + teacher.userDetails());
        System.out.println("management Information---->" + management.userDetails());
    }
}
