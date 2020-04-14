package weekThree;

import java.util.Scanner;

public class Exercise069 {
    public static boolean palindrome(String text) {
        String reverse = "";
        int reversePosition = text.length() - 1;
        for (int i = 0; i < text.length(); i++) {
            reverse += text.charAt(reversePosition);
            reversePosition--;
        }

        return reverse.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
