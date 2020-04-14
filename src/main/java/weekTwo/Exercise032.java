package weekTwo;

import java.util.Scanner;

public class Exercise032 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int start = 0;
        int end = Integer.parseInt(reader.nextLine());
        int sum = 0;


        while (start <= end) {
            sum += start;
            start++;
        }
        System.out.println("Sum is : " + sum);
    }
}
