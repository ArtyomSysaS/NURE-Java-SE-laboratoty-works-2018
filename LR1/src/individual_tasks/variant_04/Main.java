/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    4.	Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 */

package individual_tasks.variant_04;

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
        System.out.println("Сумма элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки: " + matrix.calculate());
    }
}