package weekFive.Exercise086;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double price = 2.50;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.economicalSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double price = 2.50;
        if (card.balance() >= price) {
            this.economicalSold++;
            card.pay(price);
            return true;
        }
        return false;
    }

    public double payGourmet(double cashGiven) {
        double price = 4.00;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.gourmetSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4.00;
        if (card.balance() >= price) {
            this.gourmetSold++;
            card.pay(price);
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double amount) {
        this.cashInRegister += amount;
        card.loadMoney(amount);
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
