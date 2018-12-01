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

public class DoubleMatrix {
    protected double[][] matrix;


    public DoubleMatrix(int size) {
        this.matrix = new double[size][size];
        init(0);
    }

    public DoubleMatrix(int size, double minValue, double maxValue) {
        this.matrix = new double[size][size];
        init(minValue, maxValue);
    }

    public DoubleMatrix(int rows, int cols) {
        this.matrix = new double[rows][cols];
        init(0);
    }

    public DoubleMatrix(int rows, int cols, double minValue, double maxValue) {
        this.matrix = new double[rows][cols];
        init(minValue, maxValue);
    }

    private void init(double fillValue) {

        for (double[] row : matrix) {
            Arrays.fill(this.matrix, fillValue);
        }
    }

    private void init(double minValue, double maxValue) {
        Random random = new Random();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = Math.floor(
                        random.doubles(minValue, maxValue + 1)
                                .limit(1)
                                .findFirst()
                                .getAsDouble() * 100
                ) / 100;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (double[] row : this.matrix) {
            for (double element : row) {
                stringBuilder.append(element).append("\t");
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
