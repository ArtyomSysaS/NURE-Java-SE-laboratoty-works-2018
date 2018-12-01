/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_7;

import GeneralClasses.IntegerMatrix;
import GeneralClasses.Point;
import GeneralClasses.PointArray;

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

        public long calculate() {
            int minElement = super.matrix[0][0];

            for (int i = 0; i < super.matrix.length; i++) {
                for (int j = 0; j < super.matrix[i].length; j++) {
                    if (super.matrix[i][j] < minElement) {
                        minElement = super.matrix[i][j];
                    }
                }
            }

            return fact(minElement);
        }

        private long fact(int n) {
            if (n < 0) return 0;
            return n < 2 ? 1 : n * fact(n - 1);
        }
    }

    static class Array extends PointArray {

        public Array(int size, boolean random) {
            super(size, random);
        }

        public Array(int size, double fillValue) {
            super(size, fillValue);
        }

        public double calculate() {
            double minRadius = 0f;
            double lenght;

            for (Point point : super.array) {
                lenght = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));

                if (lenght > minRadius) {
                    minRadius = lenght;
                }
            }

            return minRadius;
        }
    }
}