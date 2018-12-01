/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_13;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskClass implements Serializable {
    private List<Person> personList;

    TaskClass addPerson(Person person) {
        this.personList.add(person);

        return this;
    }


    public TaskClass() {
        this.personList = new LinkedList<>();
    }

    public static Path readFilePath() {
        Scanner scanner = new Scanner(System.in);
        boolean isDirectory = false;
        boolean repeat;
        Path path;

        do {
            repeat = false;

            if (isDirectory) System.out.println("Необходимо ввести путь к файлу, а не к директории");

            do {
                System.out.print("Введите путь файла для сериализации: ");
            } while (!scanner.hasNextLine());

            path = Paths.get(scanner.nextLine().trim());
            isDirectory = Files.isDirectory(path);

            if (isDirectory) repeat = true;

            System.out.println();
        } while (repeat);

        return path;
    }


    public void execute(Path path) throws IOException, ClassNotFoundException {
        executeWrite(personList, path.toString());
        executeRead(path.toString());
    }

    private void executeRead(String path) throws IOException, ClassNotFoundException {
        executeWrite(
                getDeserializePeopleList(path).stream()
                        .filter(person ->
                                person.getPhone().startsWith("k")
                                        || person.getPhone().startsWith("j")
                        ).collect(Collectors.toCollection(LinkedList::new)),
                Paths.get(
                        Paths.get(path).toAbsolutePath().getParent().toString(),
                        "Task13_result.txt"
                ).toString()
        );
    }

    private LinkedList<Person> getDeserializePeopleList(String path) throws IOException, ClassNotFoundException {
        LinkedList<Person> _persons;

        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);

        _persons = (LinkedList<Person>) in.readObject();

        in.close();
        fileIn.close();

        return _persons;
    }

    private void executeWrite(List<Person> personList, String path) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(personList);
        out.close();

        fileOut.close();
    }
}