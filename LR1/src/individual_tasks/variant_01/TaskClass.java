/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_01;

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

    public void modify(Swap swap, int index) {
        index--;

        switch (swap) {
            case ROWS: {
                for (int i = 0; i < super.matrix.length; i++) {
                    for (int j = 0; j < super.matrix.length - 1; j++) {
                        if (super.matrix[j][index] > super.matrix[j + 1][index]) {
                            int[] tmp = super.matrix[j];
                            super.matrix[j] = super.matrix[j + 1];
                            super.matrix[j + 1] = tmp;
                        }
                    }
                }
                break;
            }
            case COLS: {
                for (int i = 0; i < super.matrix[0].length; i++) {
                    for (int j = 0; j < super.matrix[0].length - 1; j++) {
                        if (super.matrix[index][j] > super.matrix[index][j + 1]) {
                            for (int k = 0; k < super.matrix[0].length; k++) {
                                int tmp = super.matrix[k][j];
                                super.matrix[k][j] = super.matrix[k][j + 1];
                                super.matrix[k][j + 1] = tmp;
                            }
                        }
                    }
                }
                break;
            }
        }
    }

    public enum Swap {ROWS, COLS}
}