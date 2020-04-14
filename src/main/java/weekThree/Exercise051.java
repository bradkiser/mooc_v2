package weekThree;

import java.util.Scanner;

public class Exercise051 {
    public static int nameLength(String name) { return name.length() ;}

    public static void printCharacters(String name) {
        int counter = 0;
        int rowNum = 1;

        while (counter < nameLength(name)) {
            System.out.println(rowNum + ". character: " + name.charAt(counter));
            counter++;
            rowNum++;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        printCharacters(reader.nextLine());
    }
}
