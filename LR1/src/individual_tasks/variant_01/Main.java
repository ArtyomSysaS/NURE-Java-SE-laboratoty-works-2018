/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    1.	Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 */

package individual_tasks.variant_01;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        int index;

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
        index = InputValue.repeatInputUntilInt("Введите индекс: ");

        matrix.modify(TaskClass.Swap.ROWS, index);

        System.out.println();
        System.out.println("Матрица, строки которой отсртированны по возратанию " + index + " столбца: ");
        System.out.println(matrix.toString());

        matrix.modify(TaskClass.Swap.COLS, index);

        System.out.println();
        System.out.println("Матрица, столбцы которой отсртированны по возратанию " + index + " строки: ");
        System.out.println(matrix.toString());
    }
}