/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_08;

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

    public double calculate() {
        int n = super.matrix.length;
        double chislitel = 1, znamenatel = 1;
        int[] promezh_array = new int[n];
        int stepen = n - 1;

        int a = 0, b = 0;

        // правило прямоугольника
        while (a < n && b < n) {
            int r = a, str = a + 1, str2 = a + 1, stolb = b + 1;

            //устранение нуля
            while ((super.matrix[a][b] == 0) && (str < n)) {
                for (int x = r; x < n; x++) promezh_array[x] = super.matrix[r][x];
                for (int x = r; x < n; x++) super.matrix[r][x] = super.matrix[str][x];
                for (int x = r; x < n; x++) super.matrix[str][x] = promezh_array[x];

                str = str + 1;
            }

            //реобразование матрицы по правилу прямоугольника
            while (stolb < n) {
                while (str2 < n) {
                    super.matrix[str2][stolb] =
                            super.matrix[a][b] * super.matrix[str2][stolb] -
                                    super.matrix[a][stolb] * super.matrix[str2][b];
                    str2 = str2 + 1;
                }

                stolb = stolb + 1;
                str2 = a + 1;
            }
            for (int i = a + 1; i < n; i++) {
                super.matrix[i][b] = 0;
            }

            //находим знаменатель
            if ((a < n - 1) && (b < n - 1)) {
                znamenatel = znamenatel * Math.pow(super.matrix[a][b], stepen);
            }

            stepen = stepen - 1;
            a = a + 1;
            b = b + 1;
        }

        //находим числитель матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    chislitel = chislitel * super.matrix[i][j];
                }
            }
        }

        return chislitel / znamenatel;
    }
}