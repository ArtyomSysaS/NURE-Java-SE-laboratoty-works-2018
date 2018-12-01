/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package general_team_tasks.variant_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path1, Path path2, Path path3) {
        try (
                Stream<String> stream =
                        Stream.concat(
                                Stream.concat(
                                        Files.lines(path1),
                                        Files.lines(path2)
                                ), Files.lines(path3)
                        )
        ) {
            List<String> words = new LinkedList<>();


            stream.forEach(line -> {
                boolean wordStarted = false;

                StringBuilder wordBuilder = null;

                for (char c : line.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        if (!wordStarted) {
                            wordStarted = true;
                            wordBuilder = new StringBuilder();
                        }

                        wordBuilder.append(c);
                    } else {
                        if (wordStarted) {
                            wordStarted = false;

                            words.add(wordBuilder.toString());
                        }
                    }
                }
            });

            StringBuilder builder = new StringBuilder();

            words.stream().filter(s -> s.length() > 3).forEach(s -> builder.append(s).append(" "));


            Path path = Paths.get(path3.toAbsolutePath().getParent().toString(), "Task5_result.txt");

            Files.deleteIfExists(path);
            Files.createFile(path);
            Files.write(path, builder.toString().getBytes());

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
