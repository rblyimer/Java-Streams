package PositiveNumbers;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);
        System.out.println(positive(values));
        System.out.println(positiveToo(values));
    }

    public static List<Integer> positive(List <Integer> Values) {
        return Values.stream()
                .filter(num -> num > -1)
                .collect(Collectors.toList());
    }

    public static List<Integer> positiveToo(List <Integer> Values) {
        return Values.stream()
                .filter(num -> num > -1)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
