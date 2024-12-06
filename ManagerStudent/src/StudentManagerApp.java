import java.util.Scanner;

public class StudentManagerApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Sort Students by Marks");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Student Marks: ");
                    double marks = scanner.nextDouble();
                    manager.addStudent(id, name, marks);
                }

                case 2 -> {
                    System.out.print("Enter Student ID to edit: ");
                    String id = scanner.next();
                    System.out.print("Enter new marks: ");
                    double marks = scanner.nextDouble();
                    manager.editStudent(id, marks);
                }

                case 3 -> {
                    System.out.print("Enter Student ID to delete: ");
                    String id = scanner.next();
                    manager.deleteStudent(id);
                }

                case 4 -> {
                    System.out.print("Enter Student ID to search: ");
                    String id = scanner.next();
                    manager.searchStudent(id);
                }

                case 5 -> manager.sortStudentsByMarks();

                case 6 -> manager.displayStudents();

                case 7 -> {
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}




