package weekFour.Exercise079;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    private int evenSum;
    private int oddSum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        this.evenSum = 0;
        this.oddSum = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        this.sum += number;

        if (number % 2 == 0) {
            this.evenSum += number;
        } else {
            this.oddSum += number;
        }
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public int evenSum() {
        return this.evenSum;
    }

    public int oddSum() {
        return this.oddSum;
    }
}
