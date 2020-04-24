package weekFive.Exercise085;

public class Reformatory {
    private int sum;

    public Reformatory() {
        this.sum = 0;
    }

    public int weight(Person person) {
        this.sum++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return this.sum;
    }
}
