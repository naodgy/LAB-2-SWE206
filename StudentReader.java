import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentReader {

    // Method to get a fixed list of student names
    public static List<String> getStudentNames() {
        // Creating a list with a fixed set of student names
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Abdul Majeed");
        return students;
    }

    // Method to create random groups from a list of students
    public static List<List<String>> createRandomGroups(List<String> students, int groupSize) {
        Collections.shuffle(students);  // Shuffle the list randomly
        List<List<String>> groups = new ArrayList<>();

        for (int i = 0; i < students.size(); i += groupSize) {
            groups.add(students.subList(i, Math.min(i + groupSize, students.size())));
        }

        return groups;
    }

    public static void main(String[] args) {
        List<String> students = getStudentNames();  // Get the fixed list of student names
        List<List<String>> randomGroups = createRandomGroups(students, 3);  // Create random groups of size 3

        for (List<String> group : randomGroups) {
            System.out.println(group);  // Print each group
        }
    }
}
