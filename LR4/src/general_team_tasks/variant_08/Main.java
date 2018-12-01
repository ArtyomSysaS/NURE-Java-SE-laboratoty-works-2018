/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    8. Написать 2 программы:
       одна позволяет создавать объекты Студент (имя, группа, средний балл) и сохранять их в файл в сериализованном виде
       Вторая - позволяет печатать информацию о студентах, средний бал которых выше "4" из файла на экран.
 */

package general_team_tasks.variant_08;

import general_team_tasks.Utils;

import java.io.IOException;

public class Main {
    private static final double MIN_AVG_VALUE = 2;
    private static final double MAX_AVG_VALUE = 5;


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TaskClass taskClass = new TaskClass();

        taskClass.add(
                new Student(
                        "Сыса Артём Сергеевич",
                        "КИУКИу-17-10",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Дубовик Александр Сергеевич",
                        "КИУКИу-17-10",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Солонцевой Дмитрий Михайлович",
                        "КИУКИу-17-10",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Коткова Оксана",
                        "КИУКИу-17-10",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Исаева Евгения",
                        "КИУКИу-17-9",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Бондура Максим",
                        "КИУКИу-17-9",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Стороженко Татьяна",
                        "КИУКИу-17-9",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Олефиренко Михаил",
                        "КИУКИу-16-9",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).add(
                new Student(
                        "Васюк Дмитрий",
                        "КИУКИу-16-9",
                        Utils.getRandomDouble(MIN_AVG_VALUE, MAX_AVG_VALUE)
                )
        ).execute();
    }
}
