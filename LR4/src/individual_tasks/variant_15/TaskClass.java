/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package individual_tasks.variant_15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class TaskClass {
    private static int[][] matrix;

    public static void execute(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            int size = (int) Files.lines(path).count();
            matrix = new int[size][size];

            String[] strings = stream.toArray(String[]::new);

            for (int i = 0; i < strings.length; i++) {
                Arrays.fill(matrix[i], Integer.parseInt(strings[i]));
            }

            System.out.println("\nИсходная матрица:");
            printMatrix();

            modify();

            System.out.println("\nМатрица, повёрнутая на 90 градусов по часовой стрелке:");
            printMatrix();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMatrix() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int[] row : matrix) {
            for (int element : row) {
                stringBuilder.append(element).append("\t");
            }

            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    private static void reverseColumns() {
        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
    }

    private static void transpose() {
        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
    }

    private static void modify() {
        // Трижди повернуть против часовой стрелки
        for (int i = 0; i < 3; i++) {
            transpose();
            reverseColumns();
        }
    }
}
