package weekOne;

import java.util.Scanner;

public class Exercise020 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String username = reader.nextLine();

        System.out.println("Type your password: ");
        String password = reader.nextLine();

        if (username.toLowerCase().equals("alex") && password.toLowerCase().equals("mightyducks"))
            System.out.println("You are now logged into the system!");
        else if (username.toLowerCase().equals("emily") && password.toLowerCase().equals("cat"))
            System.out.println("You are now logged into the system!");
        else System.out.println("Your username or password was invalid");
    }
}
