package general_team_tasks.variant_09;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskClass taskClass = new TaskClass();

        taskClass.AddAll(
                new LinkedList<>() {
                    {
                        add(new Sportsman("Александр", "Дубовик", 1));
                        add(new Sportsman("Дмитрий", "Солонцевой", 2));
                        add(new Sportsman("Артём", "Сыса", 3));
                        add(new Sportsman("Яна", "Сыса", 4));
                        add(new Sportsman("Оксана", "Коткова", 5));
                        add(new Sportsman("Светлана", "Громова", 6));
                        add(new Sportsman("Светлана", "Цубера", 6));
                        add(new Sportsman("Светлана", "Цубера_2", 7));
                    }
                }
        );

        System.out.println("Список спортсменов с номером 1:");
        printList(taskClass.filter(FilterType.FILTER_BY_ID, 1));

        System.out.println();

        System.out.println("Список спортсменов с фамилией 'Коткова':");
        printList(taskClass.filter(FilterType.FILTER_BY_SECOND_NAME, "Коткова"));

        System.out.println();

        System.out.println("Список спортсменов с номером 6:");
        printList(taskClass.filter(FilterType.FILTER_BY_ID, 6));

        System.out.println();

        System.out.println("Список спортсменов с фамилией 'Сыса':");
        printList(taskClass.filter(FilterType.FILTER_BY_SECOND_NAME, "Сыса"));

        System.out.println();


        System.out.println("Фильтр студентов по пользовательскому предикату: ");
        printList(
                taskClass.filter(
                        sportsman ->
                                sportsman
                                        .getFirstName()
                                        .toLowerCase()
                                        .equals("Светлана".toLowerCase()) &&
                                        sportsman.getId() == 7
                )
        );
    }

    private static void printList(List<Sportsman> sportsmanList) {
        sportsmanList.forEach(sportsman -> System.out.println("\t" + sportsman.toString()));
    }
}
