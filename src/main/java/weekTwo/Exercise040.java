package weekTwo;

public class Exercise040 {
    public static void printStars(int count) {
        int counter = 0;

        while (counter < count) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int size) {
        int counter = 0;

        while (counter < size) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int s = size;
        int counter = 0;
        int tree = 1;

        while (counter < size) {
            printWhitespaces(s - 1);
            printStars(tree);
            counter++;
            tree++;
            s--;
        }
    }

    public static void xmasTree(int height) {
        if (height > 3) {
            int counter = 0;
            int s = 1;
            int h = height;

            // prints tree
            while (counter < height) {
                printWhitespaces(h - 1);
                printStars(s);
                counter++;
                s += 2;
                h--;
            }

            // prints base
            int base = 0;

            while (base < 2) {
                int spacesNeeded = (s / 2) - 2;
                printWhitespaces(spacesNeeded);
                printStars(3);
                base++;
            }
        }
    }

    public static void main(String[] args) {
//        printTriangle(4);
        xmasTree(6);
    }
}
