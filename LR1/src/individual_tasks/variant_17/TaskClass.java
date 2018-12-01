/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_17;

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
        int sum = 0;

        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix[i].length; j++) {
                if (isLocalMinimum(i, j)) {
                    sum++;
                }
            }
        }

        return sum;
    }

    private boolean isLocalMinimum(int col, int row) {
        boolean isMinimum = true;

        for (int i = -1; i <= 1 && isMinimum; i++) {
            for (int j = -1; j <= 1 && isMinimum; j++) {
                if (i != 0 && j != 0) {
                    if (super.matrix[row][col] >= getElement(row + i, col + j)) {
                        isMinimum = false;
                    }
                }
            }
        }

        return isMinimum;
    }

    private int getElement(int col, int row) {
        int rowIndex = (row + super.matrix.length) % super.matrix.length;
        int colIndex = (col + super.matrix[0].length) % super.matrix[0].length;

        return super.matrix[rowIndex][colIndex];
    }
}