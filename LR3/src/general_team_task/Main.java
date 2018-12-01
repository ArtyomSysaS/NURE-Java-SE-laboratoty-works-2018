package general_team_task;/*
    Взять у преподавателя номер варианта с предметной областью.

    Разработать дерево структуры xml-документа, представляющую собой хранилище элементов полученной предметной области.

    Для элемента этой предметной области создать свой класс (в Java) с несколькими атрибутами и хранилище объектов этого класса.

    Сформировать xml-файл на основе информации из хранилища.

    Вывести информационное наполнение этого файла на экран.

    Добавить одну или несколько записей в хранилище и сохранить все значения в новом xml-файле,
     а затем вывести информационное наполнение этого файла на экран.


    Вариант:
        6.	Ученики школы
 */


import general_team_task.Entities.Mark;
import general_team_task.Entities.Student;
import general_team_task.Entities.XmlDom;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args)
            throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {
        new XmlDom()
                .createDocument()
                .createStudentList()
                .AddStudent(
                        "Сыса Артём Сергеевич",
                        "КИУКИУ-17-10",
                        20,
                        new Mark("СПЗ", 92),
                        new Mark("СПЗ", 95),
                        new Mark("ПJ", 17),
                        new Mark("ПJ", 17),
                        new Mark("АК", 10),
                        new Mark("АК", 9),
                        new Mark("АК", 8),
                        new Mark("ИТех", 14),
                        new Mark("ИТех", 14),
                        new Mark("СУБД", 10)
                )
                .AddStudent(
                        "Коткова Оксана Николаевна",
                        "КИУКИУ-17-10",
                        20,
                        new Mark("СПЗ", 94), new Mark("ПJ", 17),
                        new Mark("СУБД", 94), new Mark("10", 17)
                )
                .AddStudent("Солонцевой Дмитрий Михайлович", "КИУКИУ-17-9", 21)
                .AddStudent("Цубера Светлана Сергеевна", "unknown", 20)
                .RemoveStudent("Солонцевой Дмитрий Михайлович")
                .WriteToFile("Result.xml");

        List<Student> students =  new XmlDom().Parse("Result.xml").getData();

        students.forEach(student -> System.out.println(student.toString()));
    }
}
