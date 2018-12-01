/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TaskClass {
    static String readType() {
        Scanner scanner = new Scanner(System.in);
        String type;

        do {
            do {
                System.out.println("Введите тип (String, int, double, char): ");
            } while (!scanner.hasNextLine());
            type = scanner.nextLine();
        } while (!"string int double char".contains(type.toLowerCase()));

        return type;
    }

    public static void execute(Path path, String type) {
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(line -> Arrays.stream(line.split("\\s+"))
                    .filter(obj -> isType(obj, type))
                    .forEach(System.out::println));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isType(String string, String type) {
        switch (type.toLowerCase()) {
            case "char":
                return string.length() == 1 && !isDigit(string);
            case "double":
                return isDouble(string);
            case "int":
                return isInteger(string);
            case "string":
                return string.length() > 1 && !isDigit(string);
            default:
                return false;
        }
    }

    private static boolean isDigit(String s) {

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
