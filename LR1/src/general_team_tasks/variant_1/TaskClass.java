/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_1;

import GeneralClasses.DoubleMatrix;
import GeneralClasses.IntegerArray;

public class TaskClass {
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

        public void modify() {
            double max;

            int maxRowIndex = 0;
            int maxColIndex = 0;

            max = super.matrix[0][0];

            for (int i = 0; i < super.matrix.length; i++) {
                for (int j = 0; j < super.matrix[i].length; j++) {
                    if (max < super.matrix[i][j]) {
                        max = super.matrix[i][j];
                        maxRowIndex = i;
                        maxColIndex = j;
                    }
                }
            }

            if (maxColIndex == 0 && maxRowIndex == 0) return;

            if (maxRowIndex == 0) {
                swapCols(maxColIndex);
            } else {
                swapRows(maxRowIndex);
            }

            if (maxColIndex == 0) {
                swapRows(maxRowIndex);
            } else {
                swapCols(maxColIndex);
            }
        }

        private void swapRows(int maxRowIndex) {
            double[] temp = super.matrix[0];
            super.matrix[0] = super.matrix[maxRowIndex];
            super.matrix[maxRowIndex] = temp;
        }

        private void swapCols(int maxColIndex) {
            for (int i = 0; i < super.matrix.length; i++) {
                double temp = super.matrix[i][0];
                super.matrix[i][0] = super.matrix[i][maxColIndex];
                super.matrix[i][maxColIndex] = temp;
            }
        }
    }

    static class Array extends IntegerArray {
        public Array(int size) {
            super(size);
        }

        public Array(int size, int fillValue) {
            super(size, fillValue);
        }

        public Array(int size, int minValue, int maxValue) {
            super(size, minValue, maxValue);
        }

        public int calculate() {
            int quantity = 0;

            for (int i = 1; i < this.array.length; i++) {
                if (this.array[i] != this.array[0] && this.array[i] != this.array[this.array.length - 1]) {
                    quantity++;
                }
            }

            return quantity;
        }
    }
}