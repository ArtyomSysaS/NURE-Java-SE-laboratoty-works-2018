/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    19.	Перестроить заданную матрицу, переставляя в ней столбцы так, чтобы значения их характеристик убывали.
        (Характеристикой столбца прямоугольной матрицы называется сумма модулей его элементов).
 */

package individual_tasks.variant_19;

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