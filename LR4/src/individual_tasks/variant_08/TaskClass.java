/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TaskClass {

    public static void execute(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            StringBuilder stringBuilder = new StringBuilder();

            stream.forEach(line -> {
                if (line.length() > 0) {
                    stringBuilder.append(modifyLine(line)).append("\n");
                }
            });

            Path result = Paths.get(path.toAbsolutePath().getParent().toString(), "Task8_result.java");

            Files.deleteIfExists(result);
            Files.createFile(result);
            Files.write(result, stringBuilder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String modifyLine(String line) {
        return line
                .replaceAll("\\s+", " ")
                .replaceAll("\\t+", "\t")
                .replaceAll("\\n+", "\n")
                .replaceAll("\\r+", "\r");
    }
}
