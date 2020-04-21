package weekFour;

import java.util.ArrayList;

public class Exercise071 {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (Integer i : second) {
            if (!first.contains(i)) {
                first.add(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);
        list1.add(10);

        list2.add(5);
        list2.add(4);
        list2.add(10);
        list2.add(11);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list1); // prints [4, 3, 5, 10, 11, 7]

        System.out.println(list2); // prints [5, 4, 10, 11, 7]
    }
}
