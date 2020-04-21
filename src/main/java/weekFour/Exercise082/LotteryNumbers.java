package weekFour.Exercise082;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int limit = 7;
        while (this.numbers.size() < 7) {
            int draw = this.random.nextInt(40);
            if (!this.numbers.contains(draw)) {
                this.numbers.add(draw);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
