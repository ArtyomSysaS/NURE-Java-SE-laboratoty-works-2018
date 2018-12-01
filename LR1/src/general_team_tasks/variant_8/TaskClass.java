/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_8;

import GeneralClasses.DoubleArray;
import GeneralClasses.DoubleMatrix;

public class TaskClass {
    static class Array extends DoubleArray {
        public Array(int size) {
            super(size);
        }

        public Array(int size, int fillValue) {
            super(size, fillValue);
        }

        public Array(int size, double minValue, double maxValue) {
            super(size, minValue, maxValue);
        }

        public double calculate(double value) {
            int resultIndex = 0;
            double eps = Double.MAX_VALUE;

            for (int i = 0; i < super.array.length; i++) {
                if (Math.abs(super.array[i] - value) < eps) {
                    resultIndex = i;
                    eps = Math.abs(super.array[i] - value);
                }
            }

            return super.array[resultIndex];
        }
    }

    static class Matrix extends DoubleMatrix {
        public Matrix(int size) {
            super(size);
        }

        public Matrix(int size, double minValue, double maxValue) {
            super(size, minValue, maxValue);
        }

        public Matrix(int rows, int cols) {
            super(rows, cols);
        }

        public Matrix(int rows, int cols, double minValue, double maxValue) {
            super(rows, cols, minValue, maxValue);
        }

        public void modify(int row) {
            if (row < 1) return;

            row -= 1;

            for (int i = 0; i < super.matrix[row].length; i++) {
                for (int j = 0; j < super.matrix[row].length - 1; j++) {
                    if (super.matrix[row][j] > super.matrix[row][j]) {
                        double tmp = super.matrix[row][j];
                        super.matrix[row][j] = super.matrix[row][j + 1];
                        super.matrix[row][j + 1] = tmp;
                    }
                }
            }
        }
    }
}