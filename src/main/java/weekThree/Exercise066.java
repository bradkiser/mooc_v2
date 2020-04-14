package weekThree;

import java.util.ArrayList;

public class Exercise066 {
    public static int greatest(ArrayList<Integer> list) {
        int greatest = list.get(0);

        for (Integer i : list) {
            if (i > greatest) {
                greatest = i;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
