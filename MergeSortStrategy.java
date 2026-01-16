import java.util.Collections;
import java.util.List;

public class MergeSortStrategy implements SortedStrategy {
    public void sort(List<String> students) {
        System.out.println("Merge Sorted List");

        Collections.sort(students);
    }
}