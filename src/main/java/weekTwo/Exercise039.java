package weekTwo;

public class Exercise039 {
    public static void printStars(int count) {
        int counter = 0;

        while (counter < count) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        int counter = 0;

        while (counter < sideSize) {
            printStars(sideSize);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 0;

        while (counter < height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 0;

        while (counter < size) {
            counter++;
            printStars(counter);
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println();

        printSquare(4);

        System.out.println();

        printRectangle(17, 3);

        System.out.println();

        printTriangle(4);
    }
}
