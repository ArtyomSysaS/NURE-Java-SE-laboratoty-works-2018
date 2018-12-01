/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package general_team_tasks.variant_07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path, String s1, String s2) {
        try (Stream<String> stream = Files.lines(path)) {
            StringBuilder stringBuilder = new StringBuilder();

            stream.forEach(s -> stringBuilder.append(s.replaceAll(s1, s2)).append("\n"));

            Path result = Paths.get(path.toAbsolutePath().getParent().toString(), "Task6_result.txt");

            Files.deleteIfExists(result);
            Files.createFile(result);
            Files.write(result, stringBuilder.toString().getBytes());

            executeShow(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeShow(Path result) throws IOException {
        LinkedList<String> results = Files.lines(result).collect(Collectors.toCollection(LinkedList::new));

        System.out.println("\nСодержимое результирующего файла:");

        results.forEach(System.out::println);
    }
}
