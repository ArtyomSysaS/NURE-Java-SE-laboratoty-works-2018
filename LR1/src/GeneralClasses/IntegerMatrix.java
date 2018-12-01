/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package GeneralClasses;

import java.util.Arrays;
import java.util.Random;

public class IntegerMatrix {
    protected int[][] matrix;

    public IntegerMatrix(int size) {
        this.matrix = new int[size][size];
        init(0);
    }

    public IntegerMatrix(int size, int minValue, int maxValue) {
        this.matrix = new int[size][size];
        init(minValue, maxValue);
    }

    public IntegerMatrix(int rows, int cols) {
        this.matrix = new int[rows][cols];
        init(0);
    }

    public IntegerMatrix(int rows, int cols, int minValue, int maxValue) {
        this.matrix = new int[rows][cols];
        init(minValue, maxValue);
    }

    private void init(int fillValue) {

        for (int[] row : matrix) {
            Arrays.fill(row, fillValue);
        }
    }

    private void init(int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = random.ints(minValue, maxValue + 1).limit(1).findFirst().getAsInt();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int[] row : this.matrix) {
            for (int element : row) {
                stringBuilder.append(element).append("\t");
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
