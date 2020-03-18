package weekOne;

import java.util.Scanner;

public class Exercise010 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the radius: ");

        double r = Integer.parseInt(reader.nextLine());
        double n =  2 * 3.14 * r;

        System.out.print("Circumference of the circle: " + n) ;
    }
}
