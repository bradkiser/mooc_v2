package weekThree;

import java.util.Scanner;

public class Exercise055 {

    public static boolean containsWord(String word, String word2) {
        if (word.indexOf(word2) >= 0) {
            System.out.println("The word '" + word2 + "' is found in the word '" + word + "'");
            return true;
        }
        System.out.println("The word '" + word2 + "' is not found in the word '" + word + "'");
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word = reader.nextLine();

        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
        containsWord(word, secondWord);
    }
}
