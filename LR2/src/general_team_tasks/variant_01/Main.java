/*
    Вариант 1

        Создать класс Point (должен иметь два поля - координаты x и y).
        Разместить объекты этого класса во множестве в порядке удаленности от начала координат и вывести на экран.
        Затем отсортировать объекты в порядке убывания значения координаты x и вывести на экран.
        Использовать интерфейсы Comparable и Comparator.
 */

package general_team_tasks.variant_01;

import Utilities.Utilities;

public class Main {
    private static final int MAX_SET_CONTENT_QUANTITY = 20;
    private static final int MIN_SET_CONTENT_QUANTITY = 10;
    private static final int SET_CONTENT_MAXIMUM = 10;
    private static final int SET_CONTENT_MINIMUM = -10;

    private static TaskClass taskClass = new TaskClass();

    public static void main(String[] args) {
        for (int i = 0; Utilities.getRandomValue(MIN_SET_CONTENT_QUANTITY, MAX_SET_CONTENT_QUANTITY) > i; i++) {
            taskClass.getSet().add(
                    new Point(
                            Utilities.getRandomDouble(SET_CONTENT_MINIMUM, SET_CONTENT_MAXIMUM),
                            Utilities.getRandomDouble(SET_CONTENT_MINIMUM, SET_CONTENT_MAXIMUM)
                    )
            );
        }

        System.out.println("Точки в порядке удаленности от начала координат: \n");

        printSet();

        System.out.println("\nТочки в порядке убывания значения координаты Х: \n");

        taskClass.Sort();

        printSet();

    }

    private static void printSet() {
        for (Point point : taskClass.getSet()) {
            System.out.println(point.toString());
        }
    }
}
