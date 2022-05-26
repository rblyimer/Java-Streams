package AverageOfSelectedNumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            List<String> userInputs = new ArrayList<>();
            System.out.println("Input numbers, type \"end\" to stop.");
            while(true) {
                String input = in.nextLine();
                if (input.equalsIgnoreCase("end")) {
                    break;
                }
                userInputs.add(input);
            }
            double positiveAve = userInputs.stream()
                    .mapToInt(str -> Integer.valueOf(str))
                    .filter(num -> num > -1)
                    .average()
                    .getAsDouble();
            double negativeAve = userInputs.stream()
                    .mapToInt(str -> Integer.valueOf(str))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String userChoice = in.nextLine();
            if (userChoice.equalsIgnoreCase("p")) {
                System.out.println("Average of the positive numbers: " + positiveAve);
            } else if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Average of the negative numbers: " + negativeAve);
            } else {
                System.out.println("Please only enter (n/p)");
            }
        }
    }
}