package weekThree;

public class Exercise045 {
    public static int greatest(int int1, int int2, int int3) {
        int greatest = -1;

        if ((int1 > int2) && (int1 > int3)) {
            return int1;
        } else if ((int2 > int1) && (int2 > int3)) {
            return int2;
        } else {
            return int3;
        }
    }

    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}
