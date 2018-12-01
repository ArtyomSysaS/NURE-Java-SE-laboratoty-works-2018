/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(line -> {
                String[] strings = line.split("\\s+");

                double sum = 0;

                for (int i = 1; i < strings.length; i++) {
                    sum += Integer.parseInt(strings[i]);
                }

                if (sum / (strings.length - 1) > 7) {
                    System.out.println(strings[0].toUpperCase());
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
