/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_07;

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


    public void modify(Rotate rotate) {
        for (int i = 0; i < rotate.getValue(); i++) {
            rotate(super.matrix);
        }
    }

    private void rotate(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                newMatrix[i][j] = matrix[j][matrix[0].length - i - 1];
            }
        }

        super.matrix = newMatrix;
    }

    public enum Rotate {
        CounterClockwise90(1),
        CounterClockwise180(2),
        CounterClockwise270(3);

        private int value;

        Rotate(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}

