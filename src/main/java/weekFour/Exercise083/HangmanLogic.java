package weekFour.Exercise083;

public class HangmanLogic {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!this.guessedLetters.contains(letter.toLowerCase())) {
            if (!this.word.contains(letter.toLowerCase())) {
                this.numberOfFaults++;
                this.guessedLetters += letter.toLowerCase();
            } else {
                this.guessedLetters += letter.toLowerCase();
            }
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        String lowerWord = this.word.toLowerCase();

        for (int i = 0; i < lowerWord.length(); i++) {
            char l = lowerWord.charAt(i);
            String letter = "" + l;

            if (this.guessedLetters.contains(letter)) {
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}

