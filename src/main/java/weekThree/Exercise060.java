package weekThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise060 {
    public static void inputWords(Scanner reader) {
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        while (!word.isEmpty()) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
        }

        Collections.sort(words);
        System.out.println();
        System.out.println("You typed the following words: ");
        for (String w : words) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        inputWords(reader);
    }
}
