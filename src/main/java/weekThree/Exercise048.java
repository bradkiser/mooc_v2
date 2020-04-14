package weekThree;

import java.util.Scanner;

public class Exercise048 {
    public static char firstLetter(String name) {
        return name.charAt(0);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.print("First character: " + firstLetter(reader.nextLine()));
    }
}
