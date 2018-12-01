/*
    Вариант 4

        Создать класс, строящий частотный словарь текста.
        В таком словаре каждому трехбуквенному сочетанию должно приписывается количество его вхождений в текст.
        Сочетания букв, которых в тексте нет, в словарь попадать не должны.
        Сочетания в словаре не должны содержать пробелы и знаки препинания.
        Текст для анализа должен передаваться в конструкторе.
        Реализовать метод, который в качестве параметра принимал бы трехбуквенное сочетание и возвращал количество его входжений.
 */


package general_team_tasks.variant_04;

import Utilities.Utilities;

public class Main {
    /*
        String to test:
        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt neque porro quisquam est qui dolorem ipsum quia dolor sit amet consectetur adipisci velit sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem Ut enim ad minima veniam quis nostrum exercitationem ullam corporis suscipit laboriosam nisi ut aliquid ex ea commodi consequatur Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur vel illum qui dolorem eum fugiat quo voluptas nulla pariatur At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint obcaecati cupiditate non provident similique sunt in culpa qui officia deserunt mollitia animi id est laborum et dolorum fuga Et harum quidem rerum facilis est et expedita distinctio Nam libero tempore cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus omnis voluptas assumenda est omnis dolor repellendus Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae Itaque earum rerum hic tenetur a sapiente delectus ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat
     */

    public static void main(String[] args) {
        String text = Utilities.readConsoleValue("Введите текст: ");

        int range = Utilities.repeatInputUntilInt("Введите размер сочетания: ");

        TaskClass taskClass = new TaskClass(text, range);

        System.out.println("Словарь словосочетаний длинной в " + range + " символа(ов):");

        taskClass.getMap().forEach((string, quantity) -> System.out.println("\t" + string + ": " + quantity));

        do {
            System.out.println("Результат: " +
                    taskClass.getCombinationQuantity(
                            Utilities.readConsoleValue("Введите cловосочетание для поиска: ")
                    )
            );
        } while (Utilities.repeatInputUntilInt("Произвести ещё раз поиск? Да - 1, Нет - 2: ") == 1);
    }
}