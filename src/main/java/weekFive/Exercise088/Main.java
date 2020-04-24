package weekFive.Exercise088;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void start(Scanner reader, ArrayList<Student> classroom) {
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            System.out.print("student number: ");
            String studentNumber = reader.nextLine();

            if (!name.isEmpty() && !studentNumber.isEmpty()) {
                Student newStudent = new Student(name, studentNumber);
                classroom.add(newStudent);
            } else {
                break;
            }
        }
    }

    public static void print(ArrayList<Student> classroom) {
        for (Student i : classroom) {
            System.out.println(i.toString());
        }
    }

    public static void search(Scanner reader, ArrayList<Student> classroom) {
        System.out.println("Give search term: ");
        String term = reader.nextLine().toLowerCase();
        System.out.println("Result: ");
        for (Student i : classroom) {
            if (i.getName().toLowerCase().contains(term)) {
                System.out.println(i.toString());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> classroom = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        start(reader, classroom);
        print(classroom);
        search(reader, classroom);
    }
}
