import java.util.Scanner;

class Student {
    private int roll;
    private String name;
    private String course;

    int getRoll() {
        return this.roll;
    }
    
    String getName() {
        return this.name;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Roll: " + this.roll + ", Course: " + this.course);
    }

    Student(String name, String course, int roll) {
        this.name = name;
        this.course = course;
        this.roll = roll;
    }
}

class Management {
    private int s_limit;
    int s_count = 0;
    Student[] st;

    Management(int s_limit) {
        this.s_limit = s_limit;
        st = new Student[s_limit];
    }

    void addStudent(String name, String course) {
        if (s_count < s_limit) {
            Student s = new Student(name, course, s_count + 1);
            st[s_count] = s; // Fixed: Assign the student to the array
            s_count++;
            System.out.println("Student added");
        } else {
            System.out.println("Limit Exceeded");
        }
    }

    void displayStudents() {
        if (s_count == 0) {
            System.out.println("No students added");
        } else {
            for (int i = 0; i < s_count; i++) {
                st[i].display();
            }
        }
    }

    void searchStudent(int id) {
        if (s_count == 0) {
            System.out.println("No students");
        } else {
            for (int i = 0; i < s_count; i++) {
                if (st[i].getRoll() == id) {
                    System.out.println("Student found");
                    st[i].display();
                    return;
                }
            }
            System.out.println("No student found");
        }
    }
}

public class ProjectSMS {
    public static void main(String[] args) {
        Management SMS = new Management(10);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search for a Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();
                    SMS.addStudent(name, course);
                    break;
                case 2:
                    SMS.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    int id = scanner.nextInt();
                    SMS.searchStudent(id);
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
