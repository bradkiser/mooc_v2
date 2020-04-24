package weekFour.Exercise078;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int value, int upperLimit) {
        this.value = value;
        this.upperLimit = upperLimit;
    }

    public BoundedCounter(int upperLimit) {
        this(0, upperLimit);
    }

    public void next() {
        this.value++;

        if (this.value > upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if ((value > 0) && (value <= upperLimit)) {
            this.value = value;
        }
    }
}

