/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_04;

import GeneralClasses.IntegerMatrix;

import java.util.ArrayList;
import java.util.List;

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

    public long calculate() {
        int positiveElementFlag;
        int sum = 0;
        int firstPositiveElementIndex = 0;

        List<Integer> sumElement;

        for (int i = 0; i < super.matrix.length; i++) {
            positiveElementFlag = 0;
            sumElement = new ArrayList();

            for (int j = 0; j < super.matrix[i].length && positiveElementFlag < 2; j++) {

                if (super.matrix[i][j] > 0) {
                    if (positiveElementFlag == 0) {
                        firstPositiveElementIndex = j;
                    }

                    positiveElementFlag++;
                }

                if (j != firstPositiveElementIndex && positiveElementFlag == 1) {
                    sum += super.matrix[i][j];
                    sumElement.add(super.matrix[i][j]);
                }
            }

            if (positiveElementFlag != 2) {
                for (int element : sumElement) {
                    sum -= element;
                }
            }
        }

        return sum;
    }
}