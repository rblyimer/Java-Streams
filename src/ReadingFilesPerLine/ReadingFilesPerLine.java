package ReadingFilesPerLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        }
        presidents("src/ReadingFilesPerLine/file.txt");
    }

    public static List<String> presidents(String file) {
        List<String> presidents = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> presidents.add(row));
            presidents.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return presidents;
    }
}
