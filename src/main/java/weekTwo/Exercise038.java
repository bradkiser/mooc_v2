package weekTwo;

import java.util.Scanner;

public class Exercise038 {
    public static void main(String[] args) {
        printText();
    }

    public static void printText() {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many times? ");
        int t = Integer.parseInt(reader.nextLine());
        int counter = 0;

        while (counter < t) {
            System.out.println("In the beginning there were the swamp, the hoe and Java");
            counter++;
        }
    }

}
