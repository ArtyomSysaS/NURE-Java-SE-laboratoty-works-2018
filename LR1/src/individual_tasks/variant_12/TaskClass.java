/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_12;

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

    public void modify(int row, int col) {
        int minElementRowIndex = 0;
        int minElementColIndex = 0;
        int minElement = super.matrix[minElementRowIndex][minElementColIndex];

        row--;
        col--;

        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix[i].length; j++) {
                if (super.matrix[i][j] < minElement) {
                    minElement = super.matrix[i][j];
                    minElementRowIndex = i;
                    minElementColIndex = j;
                }
            }
        }

        if (row == minElementRowIndex && col == minElementColIndex) return;

        if (row != minElementRowIndex) {
            swapRows(minElementRowIndex, row);
        }

        if (col != minElementColIndex) {
            swapCols(minElementColIndex, row);
        }
    }

    private void swapCols(int firstCol, int secondCol) {
        for (int i = 0; i < super.matrix.length; i++) {
            int tmp = super.matrix[i][firstCol];
            super.matrix[i][firstCol] = super.matrix[i][secondCol];
            super.matrix[i][secondCol] = tmp;
        }
    }

    private void swapRows(int firstRow, int secondRow) {
        for (int i = 0; i < super.matrix[firstRow].length; i++) {
            int tmp[] = super.matrix[firstRow];
            super.matrix[firstRow] = super.matrix[secondRow];
            super.matrix[secondRow] = tmp;
        }
    }
}