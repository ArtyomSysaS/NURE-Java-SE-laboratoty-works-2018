/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 4.

    а) Расположить элементы главной диагонали квадратной матрицы в обратном порядке.
    б) Задан массив целых чисел. Определить, какое число встречается в нем чаще всего.
 */

package general_team_tasks.variant_4;

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

        System.out.println("Число, которое  входит в массив больше всего раз: " + array.calculate());
    }
}