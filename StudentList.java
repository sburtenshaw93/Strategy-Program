import java.util.ArrayList;
import java.util.List;


public class StudentList {
    private List<String> students;

    private SortedStrategy sortedStrategy;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(name);
    }

    public void deleteStudent(String name) {
        students.remove(name);
    }

    public void setSortedStrategy(SortedStrategy strategy) {
        this.sortedStrategy = strategy;
    }

    public void sort() {
        sortedStrategy.sort(students);
    }

    public void display() {
        for (String student : students) {
            System.out.println(" " + student);
        }
        System.out.println();
    }
}
