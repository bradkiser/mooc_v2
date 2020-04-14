package weekTwo;

import java.util.Scanner;

public class Exercise036 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");
        int sum = 0;
        int counter = 0;
        int evenCount = 0;
        int oddCount = 0;
        int n = Integer.parseInt(reader.nextLine());

        while (true) {
            if (n == -1) {
                break;
            } else {
                sum += n;
                counter++;

                if (n % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                n = Integer.parseInt(reader.nextLine());
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers " + counter);
        System.out.println("Average: " + ( (float) sum /  (float) counter));
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
