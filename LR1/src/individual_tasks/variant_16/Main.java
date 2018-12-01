/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    16.	Перестроить матрицу, переставляя в ней строки так, чтобы сумма элементов в строках полученной матрицы возрастала.
 */

package individual_tasks.variant_16;

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

        matrix.modify();

        System.out.println();
        System.out.println("Изменённая матрица: ");
        System.out.println(matrix.toString());
    }
}