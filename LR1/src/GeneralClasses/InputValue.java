/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
 */

package GeneralClasses;

import java.util.Scanner;

public class InputValue {
    public static Object readValueFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(message);
        } while (!scanner.hasNext());

        return scanner.next();
    }

    public static int readIntValueFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(message);
        } while (!scanner.hasNextInt());

        return scanner.nextInt();
    }

    public static double readDoubleValueFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(message);
        } while (!scanner.hasNextDouble());

        return scanner.nextDouble();
    }

    public static int repeatInputUntilInt(String message) {
        int result;

        do {
            result = readIntValueFromConsole(message);
        } while (result <= 0);

        return result;
    }

    public static double repeatInputUntilDouble(String message) {
        double result;

        do {
            result = readDoubleValueFromConsole(message);
        } while (result <= 0);
        return result;

    }
}

