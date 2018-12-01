/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_4;

import GeneralClasses.IntegerArray;
import GeneralClasses.IntegerMatrix;

import java.util.stream.IntStream;

public class TaskClass {
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

        public void modify() {
            for (int i = 0; i < super.matrix.length / 2; i++) {
                int temp = super.matrix[i][i];
                super.matrix[i][i] = super.matrix[super.matrix.length - i - 1][super.matrix.length - i - 1];
                super.matrix[super.matrix.length - i - 1][super.matrix.length - i - 1] = temp;
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
            int elementeQuanitity;
            int result = 0;
            int maxQuantity = 0;

            for (int element : IntStream.of(super.array).distinct().toArray()) {
                elementeQuanitity = 0;

                for (int el : super.array) {
                    if (element == el) {
                        elementeQuanitity++;
                    }
                }

                if (elementeQuanitity > maxQuantity) {
                    result = element;
                    maxQuantity = elementeQuanitity;
                }
            }
            return result;
        }
    }
}