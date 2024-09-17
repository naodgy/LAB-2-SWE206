 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StudentReader {

    public static List<List<String>> createRandomGroups(List<String> students, int groupSize) {
        Collections.shuffle(students);  // Shuffle the list randomly
        List<List<String>> groups = new ArrayList<>();
        
        for (int i = 0; i < students.size(); i += groupSize) {
            groups.add(students.subList(i, Math.min(i + groupSize, students.size())));
        }
        
        return groups;
    }

    public static void main(String[] args) {
        List<String> students = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace");
        List<List<String>> randomGroups = createRandomGroups(students, 3);

        for (List<String> group : randomGroups) {
            System.out.println(group);
        }
    }
}