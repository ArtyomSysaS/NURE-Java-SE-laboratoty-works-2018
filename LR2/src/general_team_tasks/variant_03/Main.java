/*
    Вариант 3.

        Создать класс, который в конструкторе принимал бы предложение (одну строку - набор слов, разделенных пробелами)
        и предоставлял методы для получения количества слов в предложении,
        а также словаря использованных слов в алфавитном порядке без учета регистра
*/
package general_team_tasks.variant_03;

import Utilities.Utilities;

public class Main {

    /*
        String to test:
        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt neque porro quisquam est qui dolorem ipsum quia dolor sit amet consectetur adipisci velit sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem Ut enim ad minima veniam quis nostrum exercitationem ullam corporis suscipit laboriosam nisi ut aliquid ex ea commodi consequatur Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur vel illum qui dolorem eum fugiat quo voluptas nulla pariatur At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint obcaecati cupiditate non provident similique sunt in culpa qui officia deserunt mollitia animi id est laborum et dolorum fuga Et harum quidem rerum facilis est et expedita distinctio Nam libero tempore cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus omnis voluptas assumenda est omnis dolor repellendus Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae Itaque earum rerum hic tenetur a sapiente delectus ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat
     */

    public static void main(String[] args) {

        TaskClass taskClass = new TaskClass(Utilities.readConsoleValue("Введите текст: "));

        System.out.println("Общее кол-во слов в предложении: " + taskClass.getTotalWordQuantity());
        System.out.println("Кол-во используемых слов в предложении: " + taskClass.getMap().values().size());

        System.out.println("Слова, используемые в предложении: ");
        taskClass.getMap().forEach((word, quantity) -> System.out.println("\t" + word));
    }
}