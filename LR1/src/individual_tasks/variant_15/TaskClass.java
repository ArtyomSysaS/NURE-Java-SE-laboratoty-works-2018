/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_15;

import GeneralClasses.IntegerMatrix;

public class TaskClass extends IntegerMatrix {
    public TaskClass(int size) {
        super(size);
    }

    public TaskClass(int size, int minValue, int maxValue) {
        super(size, minValue, maxValue);
    }

    public TaskClass(int rows, int cols) {
        super(rows, cols);
    }

    public TaskClass(int rows, int cols, int minValue, int maxValue) {
        super(rows, cols, minValue, maxValue);
    }

    public int calculate() {
        int result = 0;

        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix[i].length; j++) {
                if (isRowMin(i, j) && isColMax(i, j)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean isColMax(int i, int j) {
        int max = super.matrix[0][j];

        for (int k = 0; k < super.matrix.length; k++) {
            if (super.matrix[k][j] > max) {
                max = super.matrix[k][j];
            }
        }

        return max == super.matrix[i][j];
    }

    private boolean isRowMin(int i, int j) {
        int min = super.matrix[i][0];

        for (int k = 0; k < super.matrix[i].length; k++) {
            if (super.matrix[i][k] < min) {
                min = super.matrix[i][k];
            }
        }

        return min == super.matrix[i][j];
    }
}