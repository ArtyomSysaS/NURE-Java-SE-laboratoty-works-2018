/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_09;

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

    public String getChangeMatrix() {
        double[][] newArray = new double[super.matrix.length][super.matrix.length];
        double avg;
        int sum;

        for (int i = 0; i < super.matrix.length; i++) {
            sum = 0;

            for (int j = 0; j < super.matrix[i].length; j++) {
                sum += super.matrix[i][j];
            }
            avg = (double) sum / super.matrix[i].length;

            for (int j = 0; j < super.matrix[i].length; j++) {
                newArray[i][j] = super.matrix[i][j] - avg;
            }
        }

        return newArrayToString(newArray);
    }

    private String newArrayToString(double[][] newArray) {
        StringBuilder stringBuilder = new StringBuilder();

        for (double[] row : newArray) {
            for (double element : row) {
                stringBuilder.append(Math.floor(element * 1000) / 1000).append("\t");
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}