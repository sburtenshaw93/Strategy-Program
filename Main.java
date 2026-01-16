import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();

        System.out.println("▶︎ Enter student names\n▶︎ Please enter 'done' when finished: ▶︎");

        while (true) {
            System.out.print("Enter name: ▶︎ ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }
            studentList.addStudent(name);
        }
        System.out.println();
        System.out.println("Please choose a sort option: ▼");
        System.out.println("▶︎ 1. QuickSort");
        System.out.println("▶︎ 2. ShellSort");
        System.out.println("▶︎ 3. MergeSort");
        System.out.print("▶︎ Please enter choice ➞ 1, 2, or 3: ▶︎ ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            studentList.setSortedStrategy(new QuickSortStrategy());
        } else if (choice.equals("2")) {
            studentList.setSortedStrategy(new ShellSortStrategy());
        } else if (choice.equals("3")) {
            studentList.setSortedStrategy(new MergeSortStrategy());
        } else {
            System.out.println("Invalid choice. Using QuickSort as default");
            studentList.setSortedStrategy(new QuickSortStrategy());
        }
        studentList.sort();
        studentList.display();
        scanner.close();
    }
}
