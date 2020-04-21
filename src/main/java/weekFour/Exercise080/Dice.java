package weekFour.Exercise080;

import java.util.Random;

public class Dice {
    private final Random random;
    private final int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        return 1 + random.nextInt(this.numberOfSides);
    }
}
