package Utilities;

import java.util.Random;
import java.util.Scanner;

public class Utilities {
    public static int getRandomValue(int min, int max) {
        return new Random().ints(min, max + 1).limit(1).findFirst().getAsInt();
    }

    public static double getRandomDouble(double min, double max) {
        return
                Math.floor(
                        new Random().doubles(min, max + 1).limit(1).findFirst().getAsDouble() * 100
                ) / 100;
    }

    public static double calculateDistanceBetweenPoints(double firstX, double firstY, double secondX, double secondY) {
        return Math.sqrt(
                Math.pow(
                        firstX - secondX,
                        2
                ) + Math.pow(
                        firstY - secondY,
                        2
                )
        );
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

    public static int readIntValueFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(message);
        } while (!scanner.hasNextInt());

        return scanner.nextInt();
    }
}