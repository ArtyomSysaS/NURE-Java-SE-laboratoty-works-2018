/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    13. Сохранить в файл, связанный с выходным потоком, записи о телефонах и их владельцах.
        Вывести в файл записи, телефоны в которых начинаются на k и на j.
 */

package individual_tasks.variant_13;

import java.io.IOException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TaskClass taskClass = new TaskClass();
        taskClass
                .addPerson(
                        new Person(
                                "Иванов Иван Иванович",
                                "k" + UUID.randomUUID().toString()

                        )
                )
                .addPerson(
                        new Person(
                                "Петров Иван Иванович",
                                "a" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Сидоров Иван Иванович",
                                "n" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Иванов Петр Иванович",
                                "j" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Сидовор Петр Иванович",
                                "c" + UUID.randomUUID().toString(

                                )
                        )
                )
                .addPerson(
                        new Person(
                                "Перов Петр Иванович",
                                "k" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Солонцевой Дмитрий Михайлович",
                                "k" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Дубовик Александр Сергеевич",
                                "g" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Сыса Артём Сергеевич",
                                "j" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Магда Денис Сергеевич",
                                "y" + UUID.randomUUID().toString()
                        )
                )
                .addPerson(
                        new Person(
                                "Давыдовский Кирилл Костянтинович",
                                "j" + UUID.randomUUID().toString())
                )
                .execute(TaskClass.readFilePath());
    }
}
