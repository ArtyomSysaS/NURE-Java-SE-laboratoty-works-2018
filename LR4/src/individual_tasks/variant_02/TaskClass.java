/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_02;

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

            Path result = Paths.get(path.toAbsolutePath().getParent().toString(), "Task2_result.java");

            Files.deleteIfExists(result);
            Files.createFile(result);
            Files.write(result, stringBuilder.toString().replaceAll("public", "private").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
