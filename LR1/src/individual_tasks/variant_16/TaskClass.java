/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_16;

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
        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix.length - 1; j++) {
                if (calculateRowSum(j) > calculateRowSum(j + 1)) {
                    swapRows(j, j + 1);
                }
            }
        }
    }

    private int calculateRowSum(int i) {
        int sum = 0;

        for (int j = 0; j < super.matrix[i].length; j++) {
            sum += super.matrix[i][j];
        }

        return sum;
    }

    private void swapRows(int firstRowIndex, int secondRowIndex) {
        for (int i = 0; i < super.matrix[firstRowIndex].length; i++) {
            int temp[] = super.matrix[firstRowIndex];
            super.matrix[firstRowIndex] = super.matrix[secondRowIndex];
            super.matrix[secondRowIndex] = temp;
        }
    }
}