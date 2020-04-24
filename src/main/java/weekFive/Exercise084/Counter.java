package weekFive.Exercise084;

public class Counter {
    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value();
    }

    public void increase(int amount) {
        this.startingValue += amount;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int amount) {
        if (this.startingValue - amount < 0) {
            this.startingValue = 0;
        } else {
            this.startingValue -= amount;
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
