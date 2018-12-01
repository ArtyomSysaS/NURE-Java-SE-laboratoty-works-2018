/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    18.	Найти наибольший среди локальных максимумов.
        (Элемент матрицы называется локальным максимумом, если он строго больше всех своих соседей.)
 */

package individual_tasks.variant_18;

import GeneralClasses.InputValue;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map;

        TaskClass matrix = new TaskClass(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readIntValueFromConsole("Введите минимально значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        map = matrix.calculate();

        System.out.println();

        if ((boolean) map.get("exists")) {
            System.out.println("Наибольшее значение среди локальных максимумов: " + map.get("maxLocalMaximum"));
        } else {
            System.out.println("Матрица не содержит локальных максимумов");
        }
    }
}