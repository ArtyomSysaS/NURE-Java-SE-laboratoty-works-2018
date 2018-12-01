/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_10;

import GeneralClasses.IntegerArray;
import GeneralClasses.IntegerMatrix;

import java.util.stream.IntStream;

public class TaskClass {
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

        public void modify() {
            super.array = IntStream.of(super.array).distinct().toArray();
        }
    }

    static class Matrix extends IntegerMatrix {
        public Matrix(int size) {
            super(size);
        }

        public Matrix(int size, int minValue, int maxValue) {
            super(size, minValue, maxValue);
        }

        public Matrix(int rows, int cols) {
            super(rows, cols);
        }

        public Matrix(int rows, int cols, int minValue, int maxValue) {
            super(rows, cols, minValue, maxValue);
        }

        public int calculate() {
            int rowsOddQuantity = 0;
            int colsOddQuantity = 0;

            for (int i = 0; i < super.matrix.length; i++) {
                for (int j = 0; j < super.matrix[i].length; j++) {
                    if ((super.matrix[i][j] & 1) != 0) {
                        rowsOddQuantity++;
                    }
                }
            }

            int cols = super.matrix[0].length;

            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < super.matrix.length; j++) {
                    if ((super.matrix[j][i] & 1) != 0) {
                        colsOddQuantity++;
                    }
                }
            }

            return colsOddQuantity - rowsOddQuantity;
        }
    }
}