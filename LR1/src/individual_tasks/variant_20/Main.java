/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    20.	Путем перестановки элементов квадратной вещественной матрицы добиться того,
        чтобы ее максимальный элемент находился в левом верхнем углу, следующий по величине – в позиции (2,2),
        следующий по величине – в позиции (3,3) и т. д., заполнив таким образом всю главную диагональ.
 */

package individual_tasks.variant_20;

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