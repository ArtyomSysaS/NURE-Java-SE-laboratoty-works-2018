/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            StringBuilder stringBuilder = new StringBuilder();

            stream.forEach(line -> stringBuilder.append(modifyLine(line)).append("\n"));

            Path result = Paths.get(path.toAbsolutePath().getParent().toString(), "Task7_result.txt");

            Files.deleteIfExists(result);
            Files.createFile(result);
            Files.write(result, stringBuilder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String modifyLine(String line) {
        return removeParts(line, countRemovableParts(line));
    }

    private static String removeParts(String line, int count) {
        StringBuilder sb = new StringBuilder();

        if (line.length() != 0) {
            if (count > 0) {
                for (String word : line.split("\\s+")) {
                    if (word.length() != 0) {
                        if (count != 0 && word.length() >= 3 && word.length() <= 5) {
                            count--;
                        } else {
                            sb.append(word).append(" ");
                        }
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }

        return sb.length() == 0 ? line : sb.toString();
    }

    private static int countRemovableParts(String line) {
        LinkedList<String> list = Arrays.stream(line.split("\\s+"))
                .filter(s -> s.length() >= 3 && s.length() <= 5)
                .collect(Collectors.toCollection(LinkedList::new));

        if (list.size() % 2 != 0) list.removeLast();

        return list.size();
    }
}
