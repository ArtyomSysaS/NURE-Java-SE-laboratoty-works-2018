/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class TaskClass {
    private static String[][] matrix;
    private static int size;

    public static void execute(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            String[] rows = stream.toArray(String[]::new);
            size = rows.length;

            matrix = new String[size][size];

            for (int i = 0; i < size; i++) {
                matrix[i] = Arrays.stream(rows[i].split("\\s+")).toArray(String[]::new);
            }

            System.out.println("\nИсходная матрица:");
            printMatrix();
            modify();
            System.out.println("\nТранспонированная матрица:");

            printMatrix();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void modify() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                String temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void printMatrix() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String[] row : matrix) {
            for (String element : row) {
                stringBuilder.append(element).append("\t");
            }

            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder.toString());
    }
}
