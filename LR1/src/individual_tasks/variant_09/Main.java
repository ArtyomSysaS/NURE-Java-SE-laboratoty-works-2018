/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    9.	Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
 */

package individual_tasks.variant_09;

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
        System.out.println("Изменённая матрица:");
        System.out.println(matrix.getChangeMatrix());
    }
}