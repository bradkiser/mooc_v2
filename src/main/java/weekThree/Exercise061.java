package weekThree;

import java.util.ArrayList;

public class Exercise061 {
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void print(ArrayList<String> printed) {
        for (String i : printed) {
            System.out.println(i);
        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
    }

    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println();

        print(programmingLanguages);
    }
}
