/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_19;

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
        for (int i = 0; i < super.matrix[0].length; i++) {
            for (int j = 0; j < super.matrix[0].length - 1; j++) {
                if (calculateColCharacteristic(j) < calculateColCharacteristic(j + 1)) {
                    swapCols(j, j + 1);
                }
            }
        }
    }

    private void swapCols(int firstCol, int secondCol) {
        for (int i = 0; i < super.matrix.length; i++) {
            int tmp = super.matrix[i][firstCol];
            super.matrix[i][firstCol] = super.matrix[i][secondCol];
            super.matrix[i][secondCol] = tmp;
        }
    }

    private int calculateColCharacteristic(int col) {
        int sum = 0;

        for (int i = 0; i < super.matrix.length; i++) {
            sum += Math.abs(super.matrix[i][col]);
        }

        return sum;
    }
}
