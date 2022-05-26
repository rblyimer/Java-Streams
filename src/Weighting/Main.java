package Weighting;

public class Main {
    public static void main(String[] args) {
        Item one = new Item("Shirts", 50);
        Item two = new Item("Sweaters", 50);
        Suitcase firstSuitcase = new Suitcase(50);
        Suitcase secondSuitcase = new Suitcase(50);
        firstSuitcase.addItem(one);
        secondSuitcase.addItem(two);
        Hold hold = new Hold(100);
        hold.addSuitcase(firstSuitcase);
        hold.addSuitcase(secondSuitcase);
        System.out.println("First Suitcase");
        firstSuitcase.printItems();
        System.out.println("Weight: " + firstSuitcase.totalWeight());
        System.out.println("");
        System.out.println("Second Suitcase");
        secondSuitcase.printItems();
        System.out.println("Weight: " + secondSuitcase.totalWeight());
        System.out.println("");
        System.out.println("Contents and total Weight of suitcases: ");
        hold.printItems();
        System.out.println("Total Weight: " + hold.totalWeight());
    }
}