/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 10.

    а) Определить разницу между количеством нечетных чисел в столбцах и строках прямоугольной матрицы.
    б) Задан массив целых чисел. Напечатать его, удалив повторные вхождения элементов.
 */

package general_team_tasks.variant_10;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {

        TaskClass.Matrix matrix = new TaskClass.Matrix(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readIntValueFromConsole("Введите минимально значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());
        System.out.println("Разница между кол-вом нечётных чисел в столбцах и строках:" + matrix.calculate());

        System.out.println("==============================================================");

        TaskClass.Array array = new TaskClass.Array(
                InputValue.repeatInputUntilInt("Введите размер массива: "),
                InputValue.readIntValueFromConsole("Введите минимальное значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + array.toString());

        array.modify();

        System.out.println("Изменённый массив: ");
        System.out.println("\t" + array.toString());
    }
}