package weekThree;

public class Exercise044 {
    public static int least(int int1, int int2) {
        if (int1 == int2) {
            return -1;
        } else if (int1 > int2) {
            return int2;
        } else {
            return int1;
        }
    }

    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }
}
