package weekTwo;

import java.util.Scanner;

public class Exercise035 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int num = 2;

        int counter = 0;
        int sum = 0;

        while (counter <= n) {
            sum += Math.pow(num, counter);
            counter++;
        }
        System.out.println("The result is : " + sum);
    }
}
