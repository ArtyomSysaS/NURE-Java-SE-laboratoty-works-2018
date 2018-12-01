/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    7.	Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
 */

package individual_tasks.variant_07;

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
        System.out.println("Поворорот матрицы на 90 градусов против часовой стрелки: ");
        matrix.modify(TaskClass.Rotate.CounterClockwise90);
        System.out.println(matrix.toString());

        System.out.println();
        System.out.println("Поворорот матрицы на 180 градусов против часовой стрелки: ");
        matrix.modify(TaskClass.Rotate.CounterClockwise180);
        System.out.println(matrix.toString());

        System.out.println();
        System.out.println("Поворорот матрицы на 270 градусов против часовой стрелки: ");
        matrix.modify(TaskClass.Rotate.CounterClockwise270);
        System.out.println(matrix.toString());

        matrix.modify(TaskClass.Rotate.CounterClockwise90);
    }
}