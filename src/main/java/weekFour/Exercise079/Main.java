package weekFour.Exercise079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics integers = new NumberStatistics();

        System.out.println("Type numbers: ");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            } else {
                integers.addNumber(num);
            }
        }

        System.out.println("sum: " + integers.sum());
        System.out.println("sum of even: " + integers.evenSum());
        System.out.println("sum of odd: " + integers.oddSum());
    }
}
