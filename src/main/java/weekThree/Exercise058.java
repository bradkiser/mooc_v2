package weekThree;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise058 {
    public static void inputWords(Scanner reader) {
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        while (true) {
            if (!word.isEmpty()) {
                if (words.contains(word)) {
                    System.out.println("You gave the word " + word + " twice");
                    break;
                } else {
                    words.add(word);
                    System.out.print("Type a word: ");
                    word = reader.nextLine();
                }
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        inputWords(reader);
    }
}
