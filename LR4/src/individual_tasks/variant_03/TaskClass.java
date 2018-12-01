/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path) {
        try(Stream<String> stream = Files.lines(path)) {
            StringBuilder stringBuilder = new StringBuilder();
            stream.forEach(line-> stringBuilder.append(new StringBuilder(line).reverse().toString()).append("\n"));

            Path resultPath = Paths.get(path.toAbsolutePath().getParent().toString(),"Task3_result.java");

            Files.deleteIfExists(resultPath);
            Files.createFile(resultPath);
            Files.write(resultPath,stringBuilder.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
