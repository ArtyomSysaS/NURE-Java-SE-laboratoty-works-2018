/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 3.

    а) Найти сумму максимальных элементов строк вещественной матрицы.
    б) Числа Фибоначчи определяются так: f0=f1=1, fn=fn-1+fn-2.
       Задано число m. Найти первое число Фибоначчи, превосходящее m.
       Найти сумму всех чисел Фибоначчи, не превосходящих m.
 */

package general_team_tasks.variant_3;

import GeneralClasses.InputValue;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int value;

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
        System.out.println("Сумма максиальных элементов строк матрицы: " + matrix.calculate());

        System.out.println("==============================================================");
        System.out.println();

        value = InputValue.repeatInputUntilInt("Введите число: ");

        HashMap map = TaskClass.calculate(value);

        System.out.println();
        System.out.println("\nПервое число Фибоначи, превосходящее число " + value + ": " + map.get("fib"));
        System.out.println("Сумма чисел фибоначи, не превосходящих число " + value + ": " + map.get("sum"));
    }
}