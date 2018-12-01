/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_14;

import GeneralClasses.DoubleMatrix;

public class TaskClass extends DoubleMatrix {
    public TaskClass(int size) {
        super(size);
    }

    public TaskClass(int size, double minValue, double maxValue) {
        super(size, minValue, maxValue);
    }

    public TaskClass(int rows, int cols) {
        super(rows, cols);
    }

    public TaskClass(int rows, int cols, double minValue, double maxValue) {
        super(rows, cols, minValue, maxValue);
    }

    public void modify() {
        for (int i = 0; i < super.matrix.length; i++) {
            for (int j = 0; j < super.matrix[i].length; j++) {
                super.matrix[i][j] = Math.round(super.matrix[i][j]);
            }
        }
    }
}
