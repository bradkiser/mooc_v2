package weekThree;

import java.util.Scanner;

public class Exercise052 {
    public static int nameLength(String name) { return name.length(); }

    public static void printReverse(String name) {
        int counter = 0;
        int rowNum = 1;
        int r = name.length() - 1;

        while (counter < nameLength(name)) {
            System.out.println(rowNum + ". character: " + name.charAt(r));
            counter++;
            rowNum++;
            r--;

        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        printReverse(reader.nextLine());
    }
}
