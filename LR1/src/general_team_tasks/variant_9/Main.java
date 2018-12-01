/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 9.

    а) Заменить минимальные элементы столбцов вещественной матрицы нулями.
    б) Задан массив вещественных чисел. Определить, сколько из них больше «соседей»,
       т.е. предыдущего и последующего чисел.
 */

package general_team_tasks.variant_9;

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
                InputValue.readDoubleValueFromConsole("Введите минимальное значение: "),
                InputValue.readDoubleValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + array.toString());

        System.out.println();
        System.out.println("Кол-во элементов, больших своих 'соседей': " + array.calculate());
    }
}