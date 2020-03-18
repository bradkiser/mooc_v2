package weekOne;

import java.util.Scanner;

public class Exercise022 {
    public static void main(String[] args) {
        String correctPassword = "carrot";
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the password: ");
        String password = reader.nextLine();

        while (!password.equals(correctPassword)) {
            System.out.println("Wrong!");

            System.out.print("Type the password: ");
            password = reader.nextLine();
        }

        System.out.println("The secret is: jryy qbar");
    }
}
