/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_20;

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
        int max;
        int maxElementRowIndex = 0;
        int maxElementColIndex = 0;

        for (int i = 0; i < super.matrix.length; i++) {
            max = Integer.MIN_VALUE;

            for (int j = 0; j < super.matrix.length; j++) {
                for (int k = 0; k < super.matrix[j].length; k++) {
                    boolean allowCompare = true;

                    for (int l = 0; l < i && allowCompare; l++) {
                        if (j == l && k == l) {
                            allowCompare = false;
                        }
                    }

                    if (allowCompare) {
                        if (super.matrix[j][k] > max) {
                            max = super.matrix[j][k];
                            maxElementRowIndex = j;
                            maxElementColIndex = k;
                        }
                    }
                }
            }

            int tmp = super.matrix[i][i];
            super.matrix[i][i] = super.matrix[maxElementRowIndex][maxElementColIndex];
            super.matrix[maxElementRowIndex][maxElementColIndex] = tmp;
        }
    }
}

