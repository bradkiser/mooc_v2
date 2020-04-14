package weekTwo;

import java.util.Scanner;

public class Exercise033 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First:  ");
        int start = Integer.parseInt(reader.nextLine());

        System.out.print("Last:  ");
        int end = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (start <= end) {
            sum += start;
            start++;
        }
        System.out.println("Sum is : " + sum);
    }
}
