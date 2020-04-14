package weekThree;

import java.util.Scanner;

public class Exercise049 {
    public static int nameLength(String name) { return name.length(); }

    public static char lastLetter(String name) { return name.charAt(nameLength(name) - 1); }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.print("Last character: " + lastLetter(reader.nextLine()));
    }
}
