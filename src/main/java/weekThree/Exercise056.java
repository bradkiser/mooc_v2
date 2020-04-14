package weekThree;

import java.util.Scanner;

public class Exercise056 {
    public static String reverse(String text) {
        String reverse = "";
        int textLength = text.length() - 1;
        int counter = 0;

        while (counter < text.length()) {
            reverse += text.charAt(textLength);
            textLength--;
            counter++;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
//        String text = reader.nextLine();
        String text = "example";
        System.out.println("In reverse order: " + reverse(text));
    }

}
