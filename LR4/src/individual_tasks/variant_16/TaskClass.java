/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path, String s) {
        try (Stream<String> stream = Files.lines(path)) {
            System.out.println("\nСодержимое файла:");
            Files.lines(path).forEach(System.out::println);

            String[] strings = stream.toArray(String[]::new);
            List<Integer> indexes = new LinkedList<>();

            for (int i = 0; i < strings.length; i++) {
                if (strings[i].equals(s)) {
                    indexes.add(i + 1);
                }
            }

            if (indexes.size() != 0) {
                System.out.println("\nНомера строк, совпадающих с заданной:" + indexes);
            } else {
                System.out.println("\nВ файле нет строк, совпадающих с заданной");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}