package PrintingUserInput;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList <String> values = new ArrayList<>();
            while(true) {
                String input = in.nextLine();
                if (input.equals("")) {
                    break;
                }
                values.add(input);
            }
            values.forEach(input -> System.out.println(input));
        }
    }
}