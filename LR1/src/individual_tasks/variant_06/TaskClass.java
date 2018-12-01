/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_06;

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

    public double calculate() {
        double maxSum = getRowSum(0);
        double currentSum;

        for (int i = 0; i < super.matrix.length; i++) {
            if ((currentSum = getRowSum(i)) > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    private double getRowSum(int i) {
        double sum = 0;

        for (int j = 0; j < super.matrix[i].length; j++) {
            sum += super.matrix[i][j];
        }

        return sum;
    }
}