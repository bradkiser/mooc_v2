package weekOne;

import java.util.Scanner;

public class Exercise009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: " );
        double num = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        double num2 = Integer.parseInt(reader.nextLine());

        System.out.println();
        System.out.println("Division: " + (num / num2));
    }
}
