package weekFour.Exercise077;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        double price = 2.50;
        if ((this.balance - price) >= 0) {
            this.balance -= price;
        }
    }

    public void payGourmet() {
        double price = 4.00;
        if ((this.balance - price) >= 0) {
            this.balance -= price;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if ((this.balance + amount) > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }


    public static void main(String[] args) {
        LyyraCard peeka = new LyyraCard(20.00);
        LyyraCard brian = new LyyraCard(30.00);

        peeka.payGourmet();
        brian.payEconomical();

        System.out.println(peeka);
        System.out.println(brian);

        peeka.loadMoney(20.00);
        brian.payGourmet();

        System.out.println(peeka);
        System.out.println(brian);

        peeka.payEconomical();
        peeka.payEconomical();
        brian.loadMoney(50.00);

        System.out.println(peeka);
        System.out.println(brian);
    }
}
