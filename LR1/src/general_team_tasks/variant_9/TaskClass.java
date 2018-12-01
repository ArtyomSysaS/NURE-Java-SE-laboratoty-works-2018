/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_9;

import GeneralClasses.DoubleArray;
import GeneralClasses.DoubleMatrix;

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
            int cols = super.matrix[0].length;
            int minElementRowIndex;
            double minElement = 0;

            for (int i = 0; i < cols; i++) {
                minElement = super.matrix[i][0];
                minElementRowIndex = 0;

                for (int j = 0; j < super.matrix.length; j++) {
                    if (super.matrix[j][i] < minElement) {
                        minElement = super.matrix[j][i];
                        minElementRowIndex = j;
                    }
                }

                super.matrix[minElementRowIndex][i] = 0;
            }
        }
    }

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

        public int calculate() {
            int result = 0;

            for (int i = 0; i < super.array.length; i++) {
                if (super.array[i] > super.array[getElementIndex(i - 1)] && super.array[i] > super.array[getElementIndex(i + 1)]) {
                    result++;
                }
            }

            return result;
        }

        private int getElementIndex(int index) {
            return (index + super.array.length) % super.array.length;
        }
    }
}