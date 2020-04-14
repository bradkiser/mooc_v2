package weekTwo;

import java.util.Scanner;

public class Exercise031 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int start = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int stop = Integer.parseInt(reader.nextLine());

        while (start <= stop) {
            System.out.println(start);
            start++;
        }
    }
}
