/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_18;

import GeneralClasses.IntegerMatrix;

import java.util.HashMap;

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

    public HashMap calculate() {
        int maxLocalMaximum = 0;
        boolean isLocalMaximumExists = false;

        HashMap map = new HashMap();

        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix[i].length; j++) {
                if (isLocalMaxim(i, j)) {
                    if (!isLocalMaximumExists) {
                        isLocalMaximumExists = true;
                        maxLocalMaximum = super.matrix[i][j];
                    } else {
                        if (super.matrix[i][j] > maxLocalMaximum) {
                            maxLocalMaximum = super.matrix[i][j];
                        }
                    }
                }
            }
        }

        map.put("exists", isLocalMaximumExists);

        if (isLocalMaximumExists) {
            map.put("maxLocalMaximum", maxLocalMaximum);
        }

        return map;
    }

    private boolean isLocalMaxim(int col, int row) {
        boolean isMaximum = true;

        for (int i = -1; i <= 1 && isMaximum; i++) {
            for (int j = -1; j <= 1 && isMaximum; j++) {
                if (i != 0 && j != 0) {
                    if (super.matrix[row][col] <= getElement(row + i, col + j)) {
                        isMaximum = false;
                    }
                }
            }
        }

        return isMaximum;
    }

    private int getElement(int col, int row) {
        int rowIndex = (row + super.matrix.length) % super.matrix.length;
        int colIndex = (col + super.matrix[0].length) % super.matrix[0].length;

        return super.matrix[rowIndex][colIndex];
    }
}
