package weekFour.Exercise078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BoundedCounter counter = new BoundedCounter(14);
        // System.out.println("Value at start: " + counter);

        // int i = 0;
        // while (i < 16) {
        // counter.next();
        // System.out.println("Value: " + counter);
        // i++;
        // }

        // first version of clock
        // BoundedCounter hours = new BoundedCounter(23);
        // BoundedCounter minutes = new BoundedCounter(59);

        // int i = 0;
        // while (i < 121) {
        // System.out.println(hours + ":" + minutes); // prints the current time
        // minutes.next();

        // if (minutes.getValue() == 0) {
        // hours.next();
        // }
        // i++;
        // }

        // second version of clock
        Scanner reader = new Scanner(System.in);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter seconds = new BoundedCounter(59);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());

        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();

            if (seconds.getValue() == 0) {
                minutes.next();

                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }

            i++;
        }
    }

}
