package Divisible;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {
    public static void main(String[] args) {
    ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-5);
        values.add(7);

    ArrayList<Integer> divisible = divisible(values);
        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> values) {
        return values.stream()
                .filter(num -> num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}