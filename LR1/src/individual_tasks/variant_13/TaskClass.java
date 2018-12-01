/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_13;

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
            for (int j = 0; j < super.matrix[i].length; j++) {
                for (int k = 0; k < super.matrix[i].length - 1; k++) {
                    if (super.matrix[i][k] == 0) {
                        int tmp = super.matrix[i][k];
                        super.matrix[i][k] = super.matrix[i][k + 1];
                        super.matrix[i][k + 1] = tmp;
                    }
                }
            }
        }
    }
}