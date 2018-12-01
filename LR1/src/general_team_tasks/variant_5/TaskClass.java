/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_5;

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

        public void modify(int col) {
            col--;

            for (int i = 0; i < super.matrix.length; i++) {
                for (int j = 0; j < super.matrix.length - 1; j++) {
                    if (super.matrix[j][col] < super.matrix[j + 1][col]) {
                        double tmp = super.matrix[j][col];
                        super.matrix[j][col] = super.matrix[j + 1][col];
                        super.matrix[j + 1][col] = tmp;
                    }
                }
            }
        }
    }

    static HashMap cos(int x, double eps) {
        HashMap map = new HashMap();

        double prevResult = 0;
        double y = 0;

        int n = 0;

        do {
            prevResult = y;
            System.out.println(y);
            y += Math.pow(-1, n) * Math.pow(x, 2 * n) / fact(2 * n);
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
