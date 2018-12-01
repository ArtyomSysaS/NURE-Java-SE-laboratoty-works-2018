/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskClass {
    public static void execute(Path path, int n, int m) throws IOException {
        List<String> list = Files.lines(path).collect(Collectors.toList());

        System.out.println("\nСодержимое файла:\n");

        list.forEach(System.out::println);

        Collections.reverse(list);

        List<String> results = new LinkedList<>();

        try (Stream<String> stream = list.stream()) {
            stream.filter(line -> line.length() > 0)
                    .limit(n)
                    .forEach(line -> {
                        StringBuilder wordBuilder = null;

                        char[] chars = line.toCharArray();
                        boolean wordExists = false;
                        int count = 0;

                        for (int i = chars.length - 1; i >= 0 && (count != m); i--) {
                            if (Character.isAlphabetic(chars[i])) {
                                if (!wordExists) {
                                    wordExists = true;
                                    wordBuilder = new StringBuilder();
                                }

                                wordBuilder.append(chars[i]);
                            } else {
                                if (wordExists) {
                                    wordExists = false;
                                    count++;

                                    results.add(wordBuilder.reverse().toString());
                                }
                            }
                        }
                    });

            System.out.println("\nСохранённые слова: " + results.toString());
        }
    }
}
