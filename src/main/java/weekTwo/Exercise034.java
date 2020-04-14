package weekTwo;

import java.util.Scanner;

public class Exercise034 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:  ");
        int n = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int counter = 1;

        while (counter <= n) {
            factorial *= counter;
            counter++;
        }
        System.out.println("Factorial is : " + factorial);
    }
}
