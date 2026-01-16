import java.util.Collections;
import java.util.List;

public class ShellSortStrategy implements SortedStrategy {
    public void sort(List<String> students) {
        System.out.println("Shell Sorted List");

        Collections.sort(students);
    }
}