package weekOne;

import java.util.Scanner;

public class Exercise008 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: " );
        int num = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println();
        System.out.println("Sum of the numbers: " + (num + num2));
    }
}
