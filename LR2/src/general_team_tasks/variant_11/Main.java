package general_team_tasks.variant_11;

import Utilities.Utilities;

import java.util.Arrays;
import java.util.UUID;

public class Main {
    private static  final  int MIN_FLOORS_LIMIT=2;
    private static  final  int MAX_FLOORS_LIMIT=50;

    public static void main(String[] args) {
        TaskClass<Building> taskClass = new TaskClass<>();

        for (int i = 0; i < 100; i++) {
            taskClass.Add(new Building(UUID.randomUUID().toString(), Utilities.getRandomValue(MIN_FLOORS_LIMIT, MAX_FLOORS_LIMIT)));
        }

        for (Building o : taskClass.getSortedBuilding()) {
            System.out.println(o);
        }

    }
}
