/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 1.

    а) Дана вещественная матрица.
       Переставляя строки и столбцы, добиться того, чтобы наибольший элемент оказался в верхнем углу.
    б) Задан массив целых чисел. Определить, сколько элементов массива отличны от последнего и первого чисел.
 */

package general_team_tasks.variant_1;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        TaskClass.Matrix matrix = new TaskClass.Matrix(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readDoubleValueFromConsole("Введите минимально значение: "),
                InputValue.readDoubleValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        matrix.modify();

        System.out.println();
        System.out.println("Изменённая матрица: ");
        System.out.println(matrix.toString());

        System.out.println("==============================================================");

        TaskClass.Array array = new TaskClass.Array(
                InputValue.repeatInputUntilInt("Введите размер массива: "),
                InputValue.readIntValueFromConsole("Введите минимальное значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + array.toString());
        System.out.println("Количество элементов, отличных от первого и последнего элемента массива: " + array.calculate());
    }
}