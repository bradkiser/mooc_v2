package weekTwo;

import java.util.Scanner;

public class Exercise041 {

    public static int drawNumber() {
        return (int) (Math.random() * 100);
    }

    public static void startGame() {
        Scanner reader = new Scanner(System.in);
        int n = drawNumber();
        int guess = 0;
        int counter = 0;

        while (guess != n) {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            counter++;

            if (guess == n) {
                System.out.println("Congratulations, your guess is correct!");
            } else {
                if (guess > n) {
                    System.out.println("The number is lesser, guesses made: " + counter);
                } else {
                    System.out.println("The number is greater, guesses made: " + counter);
                }
            }
        }
    }

    public static void main(String[] args) {
        startGame();
    }
}
