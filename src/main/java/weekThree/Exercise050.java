package weekThree;

import java.util.Scanner;

public class Exercise050 {
    public static int nameLength(String name) {
        return name.length();
    }

    public static void printFirstThreeCharacters(String name) {
        if (nameLength(name) >= 3) {
            int rowNum = 1;
            int counter = 0;
            while (counter < 3) {
                System.out.println(rowNum + ". character: " + name.charAt(counter));
                counter++;
                rowNum++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        printFirstThreeCharacters(reader.next());
    }

}
