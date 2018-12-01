/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    12.	В матрице найти минимальный элемент и переместить его на место заданного элемента путем перестановки строк и столбцов.
 */

package individual_tasks.variant_12;

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

        matrix.modify(
                InputValue.readIntValueFromConsole("Введите индекс строки, на какую неодходимо переместить минимальный элемент: "),
                InputValue.readIntValueFromConsole("Введите индекс столбца, на каторый неодходимо переместить минимальный элемент: ")

        );

        System.out.println();
        System.out.println("Изменённая матрица: ");
        System.out.println(matrix.toString());
    }
}