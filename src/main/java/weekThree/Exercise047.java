package weekThree;

import java.util.Scanner;

public class Exercise047 {
    public static int nameLength(String name) {
        return name.length();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.print("Number of characters: " + nameLength(reader.next()));
    }
}
