/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 8.

    а) Упорядочить по возрастанию элементы заданной строки вещественной матрицы.
    б) Дан массив вещественных чисел. Напечатать число, которое наиболее близко к какому-нибудь числу.
 */

package general_team_tasks.variant_8;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        double value;

        TaskClass.Matrix matrix = new TaskClass.Matrix(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readDoubleValueFromConsole("Введите минимально значение: "),
                InputValue.readDoubleValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        System.out.println();
        matrix.modify(
                InputValue.readIntValueFromConsole("Введите номер строки, которую необходимо отсортировать по возрастанию: ")
        );

        System.out.println("Изменённая матрица: ");
        System.out.println(matrix.toString());

        System.out.println("==============================================================");

        TaskClass.Array array = new TaskClass.Array(
                InputValue.repeatInputUntilInt("Введите размер массива: "),
                InputValue.readDoubleValueFromConsole("Введите минимальное значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + array.toString());

        value = InputValue.readDoubleValueFromConsole("Введите число: ");
        System.out.println();

        System.out.println("Число, которое наиболее близко к " + value + ": " + array.calculate(value));
    }
}