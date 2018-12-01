/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_6;

import GeneralClasses.IntegerMatrix;

import java.util.HashMap;

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

        public int getSum() {
            int sum = 0;
            int j;

            for (int i = 0; i < super.matrix.length; i++) {
                j = 0;

                while (j < i) {
                    sum += super.matrix[i][j];
                    j++;
                }
            }
            return sum;
        }
    }

    static HashMap exp(int x, double eps) {
        HashMap map = new HashMap();

        double prevResult = 0;
        double y = 0;

        int n = 0;

        do {
            prevResult = y;
            y += Math.pow(x, n) / fact(n);
            n++;
        } while (Math.abs(y - prevResult) >= eps);

        map.put("y", y);
        map.put("n", n);

        return map;
    }

    private static long fact(int n) {
        if (n < 0) return 0;
        return n < 2 ? 1 : n * fact(n - 1);
    }
}