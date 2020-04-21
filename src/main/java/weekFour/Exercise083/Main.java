package weekFour.Exercise083;

public class Main {
    public static void main(String[] args) {
        HangmanLogic l = new HangmanLogic("apple");
        System.out.println("guessing: A, P, S, F, D");
        l.guessLetter("a");
        l.guessLetter("p");
        l.guessLetter("s");
        l.guessLetter("f");
        l.guessLetter("d");

        System.out.println("guessed letters: " + l.guessedLetters());
        System.out.println("number of faults: " + l.numberOfFaults());
//        l.hiddenWord();
        System.out.println("word: " + l.hiddenWord());
    }
}
