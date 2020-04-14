package weekThree;

import java.util.Scanner;

public class Exercise053 {
    public static String firstPart(String word, int length) { return word.substring(0, length); }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the first part: ");
        int len = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + firstPart(word, len));
    }
}
