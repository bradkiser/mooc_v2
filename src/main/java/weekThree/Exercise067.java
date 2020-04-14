package weekThree;

import java.util.ArrayList;

public class Exercise067 {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double total = sum(list);
        return total / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        double variance_buffer = 0.0;
        double variance_result;

        for (int i : list) {
            variance_buffer = variance_buffer + Math.pow((i - average), 2);
        }

        variance_result = variance_buffer / (list.size() - 1);

        return variance_result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        variance(list);

        System.out.println("The variance is: " + variance(list));
    }
}
