/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
    -----------------------------

    15.	Найти количество всех седловых точек матрицы.
        (Матрица А имеет седловую точку Аi,j, если Аi,j является минимальным элементом в i-й строке
        и максимальным в j-м столбце).
 */

package individual_tasks.variant_15;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        TaskClass matrix = new TaskClass(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readIntValueFromConsole("Введите минимально значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());
        System.out.println();
        System.out.println("Количество седловых точек матрицы: " + matrix.calculate());
    }
}