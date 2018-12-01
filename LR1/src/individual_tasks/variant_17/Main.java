/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    17.	Найти число локальных минимумов.
        (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол.
        Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
 */

package individual_tasks.variant_17;

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
        System.out.println("Кол-во локальных минимумов: " + matrix.calculate());
    }
}