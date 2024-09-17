import java.util.ArrayList;
import java.util.List;


public class NewApp {
    public static void main(String[] args) {
        // Your application logic goes here
        System.out.println("Hello, world!");

        System.out.println("Adding new print statmnents.")





         List<String> students = getStudentNames();
        for (String student : students) {
            System.out.println(student);
    }


    public static List<String> getStudentNames() {
        // Creating a list with three fixed student names
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        return students;
    }
}