package weekFour.Exercise073;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + ", price: " + this.price + ", amount: " + this.amount);
    }

    public static void main(String[] args) {
        Product banana = new Product("banana", 1.1, 13);
        banana.printProduct();
    }
}
