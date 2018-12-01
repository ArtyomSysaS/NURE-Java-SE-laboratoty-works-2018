/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_10;

import GeneralClasses.IntegerMatrix;

public class TaskClass  extends IntegerMatrix {

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
            int[][] newMatrix;

            int max = super.matrix[0][0];
            int newMatrixRowQuantity = 0;
            int newMatrixColQuantity;
            int rowIndex = 0;
            int colIndex = 0;

            for (int i = 0; i < super.matrix.length; i++) {
                for (int j = 0; j < super.matrix[i].length; j++) {
                    if (super.matrix[i][j] > max) {
                        max = super.matrix[i][j];
                    }
                }
            }

            newMatrixRowQuantity = calculateRowsWithoutMaxElement(max);
            newMatrixColQuantity = calculateColsWithoutMaxElement(max);
            newMatrix = new int[newMatrixRowQuantity][newMatrixColQuantity];

            for (int i = 0; i < super.matrix.length; i++) {
                for (int j = 0; j < super.matrix[i].length; j++) {
                    if (isElementNotInRowsAndColWithMaxElement(i, j, max)) {
                        newMatrix[rowIndex][colIndex] = super.matrix[i][j];
                        colIndex++;

                        if (colIndex == newMatrixColQuantity) {
                            rowIndex++;
                            colIndex = 0;
                        }
                    }
                }
            }

            super.matrix = newMatrix;
        }

        private boolean isElementNotInRowsAndColWithMaxElement(int row, int col, int max) {
            boolean result = true;

            for (int i = 0; i < super.matrix[0].length && result; i++) {
                if (super.matrix[row][i] == max) {
                    result = false;
                }
            }

            for (int i = 0; i < super.matrix.length && result; i++) {
                if (super.matrix[i][col] == max) {
                    result = false;
                }
            }

            return result;
        }

        private int calculateColsWithoutMaxElement(int max) {
            int quantity = 0;
            boolean maxValueExistsInCols;

            for (int i = 0; i < super.matrix[0].length; i++) {
                maxValueExistsInCols = false;

                for (int j = 0; j < super.matrix.length && !maxValueExistsInCols; j++) {
                    if (super.matrix[j][i] == max) {
                        maxValueExistsInCols = true;
                    }
                }

                if (!maxValueExistsInCols) quantity++;
            }

            return quantity;
        }

        private int calculateRowsWithoutMaxElement(int max) {
            int quantity = 0;
            boolean maxValueExistsInRow;

            for (int i = 0; i < super.matrix.length; i++) {
                maxValueExistsInRow = false;

                for (int j = 0; j < super.matrix[i].length && !maxValueExistsInRow; j++) {
                    if (super.matrix[i][j] == max) {
                        maxValueExistsInRow = true;
                    }
                }

                if (!maxValueExistsInRow) quantity++;
            }

            return quantity;
        }
    }
