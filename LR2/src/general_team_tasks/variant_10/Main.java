package general_team_tasks.variant_10;

import java.awt.*;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TaskClass taskClass = new TaskClass();

        taskClass
                .Add(new Car("Suzuki", UUID.randomUUID().toString(), Color.BLACK))
                .Add(new Car("Suzuki", UUID.randomUUID().toString(), Color.RED))
                .Add(new Car("Audi", UUID.randomUUID().toString(), Color.GRAY))
                .Add(new Car("Audi", UUID.randomUUID().toString(), Color.WHITE))
                .Add(new Car("Bentley", UUID.randomUUID().toString(), Color.YELLOW))
                .Add(new Car("Bentley", UUID.randomUUID().toString(), Color.MAGENTA))
                .Add(new Car("Bentley", UUID.randomUUID().toString(), Color.BLUE))
                .Add(new Car("Tesla", UUID.randomUUID().toString(), Color.BLACK))
                .Add(new Car("Tesla", UUID.randomUUID().toString(), Color.WHITE))
                .Add(new Car("Tesla", UUID.randomUUID().toString(), Color.GRAY));

        System.out.println("Tesla cars: ");

        taskClass.getCarsByMark("Tesla").forEach(System.out::println);

        System.out.println("Audi cars: ");

        taskClass.getCarsByMark("Audi").forEach(System.out::println);
    }
}
