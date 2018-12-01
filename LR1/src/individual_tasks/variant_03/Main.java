/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    3.	Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 */

package individual_tasks.variant_03;

import GeneralClasses.InputValue;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap result;

        int[] upRange;
        int[] downRange;

        TaskClass matrix = new TaskClass(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readIntValueFromConsole("Введите минимально значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        result = matrix.calculate();
        upRange = (int[]) result.get("maxUpElementRange");
        downRange = (int[]) result.get("maxDownElementRange");

        System.out.println();
        System.out.println("Количество максимально длинной возрастающей последовательности: " + upRange.length);
        System.out.println("Максимально длинная возрастающая последовательность: " + Arrays.toString(upRange));
        System.out.println("Количество максимально длинной убывающей последовательности: " + downRange.length);
        System.out.println("Максимально длинная убывающая последовательность: " + Arrays.toString(downRange));
    }
}