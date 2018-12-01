package individual_task;

import individual_task.Models.StaxModel;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) throws XMLStreamException, IOException {
        new StaxModel()
                .createDocument()

                .StartCategories()

                .StartCategory("Асторовые")

                .CreateFlower("Астра", "Двудольные")
                .CreateFlower("Астра Альпийская", "Двудольные")

                .EndCategory()

                .StartCategory("Шиповники")

                .CreateFlower("Роза", "Красная")
                .CreateFlower("Шиповник", "Собачий")

                .EndCategory()

                .StartCategory("Лилейные")

                .CreateFlower("Лилия", "Белоснежная")
                .CreateFlower("Лилия", "Чёрные")
                .EndCategory()

                .EndCategories()

                .endDocument()

                .writeToFile("result_1.xml");

        new StaxModel().parse("result_1.xml").forEach(c -> {
            System.out.println(c.toString());

            c.getFlowers().forEach(f -> System.out.println(MessageFormat.format("\t{0}", f.toString())));
        });
    }
}
