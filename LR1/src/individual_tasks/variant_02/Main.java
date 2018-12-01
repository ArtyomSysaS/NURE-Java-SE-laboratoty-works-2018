/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------

    2.	Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
 */

package individual_tasks.variant_02;

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
        index = InputValue.repeatInputUntilInt("Введите кол-во позиций для циклического сдвига матрицы влево: ");

        matrix.modify(TaskClass.ShiftSide.LEFT, index);

        System.out.println();
        System.out.println("Матрица, циклически сдвинута на  " + index + " позиций влево: ");
        System.out.println(matrix.toString());

        System.out.println();
        index = InputValue.repeatInputUntilInt("Введите кол-во позиций для циклического сдвига матрицы вправо: ");

        matrix.modify(TaskClass.ShiftSide.RIGHT, index);

        System.out.println();
        System.out.println("Матрица, циклически сдвинута на  " + index + " позиций право: ");
        System.out.println(matrix.toString());

        System.out.println();
        index = InputValue.repeatInputUntilInt("Введите кол-во позиций для циклического сдвига матрицы вверх: ");

        matrix.modify(TaskClass.ShiftSide.UP, index);

        System.out.println();
        System.out.println("Матрица, циклически сдвинута на  " + index + " позиций вверх: ");
        System.out.println(matrix.toString());

        System.out.println();
        index = InputValue.repeatInputUntilInt("Введите кол-во позиций для циклического сдвига матрицы вниз: ");

        matrix.modify(TaskClass.ShiftSide.DOWN, index);

        System.out.println();
        System.out.println("Матрица, циклически сдвинута на  " + index + " позиций вниз: ");
        System.out.println(matrix.toString());
    }
}