/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_3;

import GeneralClasses.DoubleMatrix;

import java.util.HashMap;

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

        public double calculate() {
            double[] maxElements = new double[super.matrix.length];
            double result = 0;

            for (int i = 0; i < super.matrix.length; i++) {
                double maxElement = super.matrix[i][0];

                for (int j = 0; j < super.matrix[i].length; j++) {
                    if (super.matrix[i][j] > maxElement) {
                        maxElement = super.matrix[i][j];
                    }
                }

                maxElements[i] = maxElement;
            }

            for (double element : maxElements) {
                result += element;
            }

            return result;
        }
    }

    public static HashMap calculate(int m) {
        HashMap map = new HashMap();

        long fib = 0;
        long n1 = 0;
        long n2 = 1;
        long sum = 1;

        while (fib < m) {
            fib = n1 + n2;

            sum += fib;
            n1 = n2;
            n2 = fib;
        }

        map.put("fib", fib);
        map.put("sum", sum - fib);

        return map;
    }
}