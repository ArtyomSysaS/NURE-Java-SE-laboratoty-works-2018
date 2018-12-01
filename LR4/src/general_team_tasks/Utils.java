package general_team_tasks;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static int getRandomValue(int min, int max) {
        return new Random().ints(min, max + 1).limit(1).findFirst().getAsInt();
    }

    public static double getRandomDouble(double min, double max) {
        return
                Math.floor(
                        new Random().doubles(min, max ).limit(1).findFirst().getAsDouble() * 100
                ) / 100;
    }

    public static String readConsoleValue(String message) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(message);
        } while (!scanner.hasNext());

        return scanner.nextLine();
    }

    public static int repeatInputUntilInt(String message) {
        int result;

        do {
            result = readIntValueFromConsole(message);
        } while (result <= 0);

        return result;
    }

    private static int readIntValueFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(message);
        } while (!scanner.hasNextInt());

        return scanner.nextInt();
    }

    public static Path readFilePath() {
        Scanner scanner = new Scanner(System.in);
        boolean fileExists = true;
        boolean isDirectory = false;
        boolean repeat;
        Path path;


        do {
            repeat = false;
            if (!fileExists) System.out.println("Файла с введённым адресом не существует. Повторите ещё раз.");
            if (isDirectory) System.out.println("Необходимо ввести путь к файлу, а не к директории");

            do {
                System.out.print("Введите путь файла: ");
            } while (!scanner.hasNextLine());

            path = Paths.get(scanner.nextLine().trim());

            isDirectory = Files.isDirectory(path);
            fileExists = Files.exists(path);

            if (!fileExists) {
                repeat = true;
            } else {
                if (isDirectory) {
                    repeat = true;
                }
            }

            System.out.println();
        } while (repeat);

        return path;
    }

    public static int readInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        int value = 1;

        do {
            if (value < 1) System.out.println("Индекс должен быть больше 0!");

            do {
                System.out.print(msg);
            } while (!scanner.hasNextInt());

            System.out.println();

        } while ((value = scanner.nextInt()) < 1);

        return value;
    }

}