package weekFour.Exercise076;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu;

    public Menu() {
        this.menu = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (!this.menu.contains(meal)) {
            this.menu.add(meal);
        }
    }

    public void printMenu() {
        for (String i : menu) {
            System.out.println(i);
        }
    }

    public void clearMenu() {
        this.menu.clear();
    }

    public static void main(String[] args) {
        Menu test = new Menu();
        test.addMeal("Hamburger");
        test.addMeal("Fish'n'Chips");
        test.addMeal("Sauerkraut");
        test.addMeal("Hamburger");
    }
}
