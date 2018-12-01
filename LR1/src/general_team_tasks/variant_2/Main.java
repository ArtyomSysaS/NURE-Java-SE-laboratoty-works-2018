/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------

    Вариант 2.

    а) Рассматривая элементы массива как координаты точек на плоскости, найти наибольшее расстояние между этими точками.
    б) Задан массив целых чисел. Напечатать те из них, которые входят в массив по одному разу.
 */

package general_team_tasks.variant_2;

import GeneralClasses.InputValue;

public class Main {
    public static void main(String[] args) {
        TaskClass.ArrayOfPoints arrayOfPoints = new TaskClass.ArrayOfPoints(
                InputValue.repeatInputUntilInt("Введите размер массива: "),
                true
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + arrayOfPoints.toString());

        System.out.println("Наибольшее расстояние между точками массива: " + arrayOfPoints.calculate());
        System.out.println();

        System.out.println("==============================================================");

        TaskClass.Array array = new TaskClass.Array(
                InputValue.repeatInputUntilInt("Введите размер массива: "),
                InputValue.readIntValueFromConsole("Введите минимальное значение: "),
                InputValue.readIntValueFromConsole("Введите максимальное значение: ")
        );

        System.out.println();
        System.out.println("Исходный массив: ");
        System.out.println("\t" + array.toString());

        System.out.println();
        System.out.print("Элементы, которые входят в массив только 1 раз: ");

        array.calculate();
    }
}