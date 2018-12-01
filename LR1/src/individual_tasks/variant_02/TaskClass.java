/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_02;

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

    public void modify(ShiftSide shiftSide, int step) {
        for (int i = 0; i < step; i++) {
            switch (shiftSide) {
                case LEFT: {
                    shiftMatrixLeft();
                    break;
                }
                case RIGHT: {
                    shiftMatrixRight();
                    break;
                }
                case UP: {
                    shiftMatrixUp();
                    break;
                }
                case DOWN: {
                    shiftMatrixDown();
                    break;
                }
            }
        }
    }

    private void shiftMatrixLeft() {
        for (int i = 0; i < super.matrix.length; i++) {
            int tmp = super.matrix[i][0];

            for (int j = 0; j < super.matrix[i].length - 1; j++) {
                super.matrix[i][j] = super.matrix[i][j + 1];
            }

            super.matrix[i][super.matrix[i].length - 1] = tmp;
        }
    }

    private void shiftMatrixRight() {
        for (int i = 0; i < super.matrix.length; i++) {
            int tmp = super.matrix[i][super.matrix[i].length - 1];

            for (int j = super.matrix[i].length - 1; j > 0; j--) {
                super.matrix[i][j] = super.matrix[i][j - 1];
            }

            super.matrix[i][0] = tmp;
        }
    }

    private void shiftMatrixUp() {
        int tmp[] = super.matrix[0];

        for (int j = 0; j < super.matrix.length - 1; j++) {
            super.matrix[j] = super.matrix[j + 1];
        }

        super.matrix[super.matrix.length - 1] = tmp;
    }

    private void shiftMatrixDown() {
        int tmp[] = super.matrix[super.matrix.length - 1];

        for (int j = super.matrix.length - 1; j > 0; j--) {
            super.matrix[j] = super.matrix[j - 1];
        }

        super.matrix[0] = tmp;
    }

    public enum ShiftSide {
        LEFT, RIGHT, UP, DOWN
    }
}
