/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_05;

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
            for (int j = i + 1; j < super.matrix.length; j++) {
                int temp = super.matrix[i][j];
                super.matrix[i][j] = super.matrix[j][i];
                super.matrix[j][i] = temp;
            }
        }
    }
}