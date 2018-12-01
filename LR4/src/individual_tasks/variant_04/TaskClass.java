/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            StringBuilder stringBuilder = new StringBuilder();
            stream.forEach(line -> stringBuilder.append(line).append("\n"));

            StringBuilder resultBuilder = new StringBuilder();
            StringBuilder wordBuilder = null;

            boolean wordEnded = true;
            boolean wordExists = false;

            for (char c : stringBuilder.toString().toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    if (!wordExists) wordExists = true;

                    if (wordEnded) {
                        wordBuilder = new StringBuilder();
                        wordEnded = false;
                    }

                    wordBuilder.append(c);
                } else {
                    if (wordExists) {
                        resultBuilder.append(
                                wordBuilder.toString().length() > 2 ?
                                        wordBuilder.toString().toUpperCase() :
                                        wordBuilder.toString()
                        );

                        wordExists = false;
                        wordEnded = true;
                    }

                    resultBuilder.append(c);
                }
            }

            Path resultPath = Paths.get(path.toAbsolutePath().getParent().toString(), "Task4_result.java");

            Files.deleteIfExists(resultPath);
            Files.createFile(resultPath);
            Files.write(resultPath, resultBuilder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}