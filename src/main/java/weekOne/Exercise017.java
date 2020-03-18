package weekOne;

import java.util.Scanner;

public class Exercise017 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number ");
        int num = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number ");
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println();

        if (num == num2) System.out.println("The numbers are equal!");
        else if (num > num2) System.out.println("Greater number: " + num);
        else System.out.println("Greater number: " + num2);
    }
}
