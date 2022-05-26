package AverageNumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            List <String> input = new ArrayList<>();
            System.out.println("Input numbers, type \"end\" to stop.");

            while(true) {
                String userInput = in.nextLine();
                if (userInput.equalsIgnoreCase("end")) {
                    break;
                }
                input.add(userInput);
            }
            double average = input.stream()
                    .mapToInt(str -> Integer.valueOf(str))
                    .average()
                    .getAsDouble();
            System.out.println("average of the numbers: " + average);
        }
    }
}