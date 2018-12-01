/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 5.

    а) Упорядочить по убыванию элементы заданного столбца матрицы.
    б) Заданы вещественные числа х и eps.
       Вычислить с точностью до eps сумму следующего ряда y=cos(x)=1-x^2/2!+x^4/4!-… +(-1n)x^(2n)/(2n)!+…
       Вывести значения y и n. Сравнить со значением Math.cos(х).
 */

package general_team_tasks.variant_5;

import GeneralClasses.InputValue;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int x;
        double eps;

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
        matrix.modify(
                InputValue.readIntValueFromConsole("Введите номер столбца, который необходимо отсортировать по убыванию: ")
        );

        System.out.println("Изменённая матрица: ");
        System.out.println(matrix.toString());

        System.out.println("==============================================================");

        x = InputValue.repeatInputUntilInt("Введите значение: ");
        eps = InputValue.repeatInputUntilDouble("Введите значение точности вычисления: ");

        HashMap map = TaskClass.cos(x, eps);

        System.out.println("\nКол-во итераций: " + map.get("n"));

        System.out.println("Результат вычисления: " + map.get("y"));
        System.out.println("Результат функции Math.cos(x): " + Math.cos(x * Math.PI / 180));
    }
}