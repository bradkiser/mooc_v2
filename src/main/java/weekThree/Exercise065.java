package weekThree;

import java.util.ArrayList;

public class Exercise065 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> wordLengths = new ArrayList<Integer>();

        for (String s : list) {
            wordLengths.add(s.length());
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
