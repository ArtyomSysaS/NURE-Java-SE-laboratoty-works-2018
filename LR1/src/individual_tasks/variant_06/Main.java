/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    6.	Вычислить норму матрицы
 */

package individual_tasks.variant_06;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        TaskClass matrix = new TaskClass(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readDoubleValueFromConsole("Введите минимально значение: "),
                InputValue.readDoubleValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        System.out.println();
        System.out.println("Норма матрицы: " + matrix.calculate());
    }
}