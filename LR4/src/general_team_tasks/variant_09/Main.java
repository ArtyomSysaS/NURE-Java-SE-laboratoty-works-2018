/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    9. Создать программу, позволяющую пользователю ввести данные нескольких автомобилей с консоли (марку, номер, цвет).
       После этого данные о машинах сохраняются в файле в сериализованном виде и могут быть оттуда загружены в коллекцию
       и распечатаны.
 */

package general_team_tasks.variant_09;


import java.awt.*;
import java.io.IOException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TaskClass taskClass = new TaskClass();
        taskClass.add(
                new Car(
                        UUID.randomUUID().toString(),
                        "BMW",
                        Color.GRAY
                )
        ).add(
                new Car(
                        UUID.randomUUID().toString(),
                        "Suzuki",
                        Color.RED
                )
        ).add(
                new Car(
                        UUID.randomUUID().toString(),
                        "Toyota",
                        Color.WHITE
                )
        ).add(
                new Car(
                        UUID.randomUUID().toString(),
                        "Porshe",
                        Color.BLACK
                )
        ).execute();
    }
}
