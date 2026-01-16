import java.util.Collections;
import java.util.List;

public class QuickSortStrategy implements SortedStrategy {
    public void sort(List<String> students) {
        System.out.println("Quick Sorted List");

        Collections.sort(students);
    }
}
