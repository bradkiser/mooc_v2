package weekTwo;

import java.util.Scanner;

public class Exercise030 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int stop = Integer.parseInt(reader.nextLine());
        int counter = 0;

        while (counter < stop) {
            counter++;
            System.out.println(counter);
        }
    }
}
