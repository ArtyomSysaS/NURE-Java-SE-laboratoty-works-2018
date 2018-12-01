/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_11;

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

    public void modify() {
        int newMatrixRowQunatity = calculateNoFullZeroRows();
        int newMatrixColQunatity = calculateNoFullZeroCols();
        int rowIndex = 0;
        int colIndex = 0;

        int[][] newMatrix = new int[newMatrixRowQunatity][newMatrixColQunatity];

        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix[i].length; j++) {
                if (!isElementIntDeletedRowOrCol(i, j)) {
                    newMatrix[rowIndex][colIndex++] = super.matrix[i][j];

                    if (colIndex == newMatrixColQunatity) {
                        rowIndex++;
                        colIndex = 0;
                    }
                }
            }
        }

        super.matrix = newMatrix;
    }

    private boolean isElementIntDeletedRowOrCol(int row, int col) {
        boolean zeroCol = true;
        boolean zeroRow = true;

        for (int i = 0; i < super.matrix.length && zeroCol; i++) {
            if (super.matrix[i][col] != 0) {
                zeroCol = false;
            }
        }

        for (int i = 0; i < super.matrix[row].length && zeroRow; i++) {
            if (super.matrix[row][i] != 0) {
                zeroRow = false;
            }
        }

        return zeroCol || zeroRow;
    }

    private int calculateNoFullZeroCols() {
        int result = 0;
        boolean isNotZeroElementContains;

        for (int i = 0; i < super.matrix[0].length; i++) {
            isNotZeroElementContains = false;

            for (int j = 0; j < super.matrix.length && !isNotZeroElementContains; j++) {
                if (super.matrix[j][i] != 0) {
                    isNotZeroElementContains = true;
                }
            }

            if (isNotZeroElementContains) {
                result++;
            }
        }

        return result;
    }

    private int calculateNoFullZeroRows() {
        int result = 0;
        boolean isNotZeroElementContains;

        for (int i = 0; i < super.matrix.length; i++) {
            isNotZeroElementContains = false;

            for (int j = 0; j < super.matrix[i].length && !isNotZeroElementContains; j++) {
                if (super.matrix[i][j] != 0) {
                    isNotZeroElementContains = true;
                }
            }

            if (isNotZeroElementContains) {
                result++;
            }
        }

        return result;
    }
}