package LimitedNumbers;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> values = new ArrayList<>();
            while(true) {
                int input = Integer.valueOf(in.nextLine());
                if (input < 0) {
                    break;
                }
                values.add(input);
            }
            values.stream()
                    .filter(num -> num > 0 && num < 6)
                    .forEach(num -> System.out.println(num));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
