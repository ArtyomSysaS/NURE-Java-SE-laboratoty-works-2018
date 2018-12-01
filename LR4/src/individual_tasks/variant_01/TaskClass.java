/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_01;

import individual_tasks.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class TaskClass {

    static void executeWrite(Path path, int min_rand_limit, int max_rand_limit) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < Utils.getRandomValue(0, 10000); i++) {
            stringBuilder.append(Utils.getRandomValue(min_rand_limit, max_rand_limit)).append(" ");
        }

        Files.deleteIfExists(path);
        Files.createFile(path);
        Files.write(path, stringBuilder.toString().getBytes());

        executeSort(path);
    }

    private static void executeSort(Path path) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(line -> {
                Arrays.stream(line.split("\\s+")).forEach(number -> list.add(parseInt(number)));
            });
        }

        list.sort((o1, o2) -> {
            if (o1 > o2) return 1;
            if (o1 < o2) return -1;
            return 0;
        });

        StringBuilder stringBuilder = new StringBuilder();

        list.forEach(integer -> stringBuilder.append(integer).append(" "));

        Path writePath = Paths.get(path.toAbsolutePath().getParent().toString(),"task1_result.txt");
        Files.deleteIfExists(writePath);
        Files.createFile(writePath);
        Files.write(writePath, stringBuilder.toString().getBytes());

    }

    public static Path readFilePath() {
        Scanner scanner = new Scanner(System.in);
        boolean isDirectory = false;
        boolean repeat;
        Path path;

        do {
            repeat = false;

            if (isDirectory) System.out.println("Необходимо ввести путь к файлу, а не к директории");

            do {
                System.out.print("Введите путь файла: ");
            } while (!scanner.hasNextLine());

            path = Paths.get(scanner.nextLine().trim());
            isDirectory = Files.isDirectory(path);

            if (isDirectory) repeat = true;

            System.out.println();
        } while (repeat);

        return path;
    }
}
