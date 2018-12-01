/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 7.

    а) Найти факториал минимального числа заданной строки матрицы.
    б) Заданы вещественные числа х1, у1, х2, у2,…, хn, yn.
       Найти радиус  наименьшего  круга (с центром в начале координат), внутрь которого попадают все эти точки.
 */

package general_team_tasks.variant_7;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        TaskClass.Matrix matrix = new TaskClass.Matrix(
                InputValue.repeatInputUntilInt("Введите кол-во строк матрицы: "),
                InputValue.repeatInputUntilInt("Введите кол-во столбцов матрицы: "),
                InputValue.readIntValueFromConsole("Введите минимально значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println(matrix.toString());

        System.out.println("Факториал наименьшего числа матрицы: " + matrix.calculate());

        System.out.println("==============================================================");

        TaskClass.Array array = new TaskClass.Array(
                InputValue.repeatInputUntilInt("Введите размер массива: "),
                true
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + array.toString());

        System.out.println("Радиус наименьшего круга, внутрь котого попадут все точки массива: " + array.calculate());
        System.out.println();
    }
}