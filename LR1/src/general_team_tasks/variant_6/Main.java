/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 6.

    а) Определить сумму всех элементов, расположенных ниже главной диагонали квадратной матрицы.
    б) Заданы вещественные числа х и eps.
       Вычислить с точностью до eps сумму ряда y=ex=1+x/1!+x^2/2!+…+x*n/n!+…
       Вывести значения y и n. Сравнить со значением Math.ехр(х).
 */

package general_team_tasks.variant_6;

import GeneralClasses.InputValue;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int exp;
        double eps;

        TaskClass.Matrix matrix = new TaskClass.Matrix(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readIntValueFromConsole("Введите минимально значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        System.out.println("Сумма элементов, лежащиъ ниже главной диагонали: " + matrix.getSum());

        System.out.println("==============================================================");

        exp = InputValue.repeatInputUntilInt("Введите значение степени: ");
        eps = InputValue.repeatInputUntilDouble("Введите значение точности вычисления: ");

        HashMap map = TaskClass.exp(exp, eps);

        System.out.println("\nКол-во итераций: " + map.get("n"));

        System.out.println("Результат вычисления: " + map.get("y"));
        System.out.println("Результат функции Math.exp(n): " + Math.exp(exp));
    }
}