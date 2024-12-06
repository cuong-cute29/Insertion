import java.util.ArrayList;

public class StudentManager {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String id, String name, double marks) {
        students.add(new Student(id, name, marks));
    }

    public void editStudent(String id, double newMarks) {
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                student.setMarks(newMarks);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void deleteStudent(String id) {
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void searchStudent(String id) {
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void sortStudentsByMarks() {
        for (int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getMarks() > key.getMarks()) {
                students.set(j + 1, students.get(j));
                j--;
            }
            students.set(j + 1, key);
        }
        System.out.println("Students sorted by marks.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}



