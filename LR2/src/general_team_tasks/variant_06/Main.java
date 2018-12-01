/*
    Вариант 6

        Разработать абстрактный класс Person и объявить в нем абстрактный метод getName().
        Создать два наследника этого класса - Student и Teacher, в которых реализовать этот метод.
        Создать класс-контейнер, который представлял бы собой список объектов класса Person
        (объекты других классов в него добавлять нельзя).
        Объекты в контейнере должны храниться в алфавитном порядке имен.
        Реализовать в контейнере метод, распечатывающий имена всех студентов и преподавателей на консоль
        (каждого с новой строки).
*/
package general_team_tasks.variant_06;

import general_team_tasks.variant_06.Persons.Student;
import general_team_tasks.variant_06.Persons.Teacher;

public class Main {
    public static void main(String[] args) {
        TaskClass taskClass = new TaskClass();

        taskClass.add(new Student("Сыса","Артём"));
        taskClass.add(new Teacher("Борисенко","Виктор"));
        taskClass.add(new Student("Исаева","Евгения"));
        taskClass.add(new Teacher("Фомичёв","Александр"));
        taskClass.add(new Student("Коткова","Оксана"));

        taskClass.print();
    }
}
