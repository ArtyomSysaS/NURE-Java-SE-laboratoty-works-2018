/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   30.11.2018              |
    -----------------------------
*/

package individual_tasks.variant_03;

import GeneralClasses.IntegerMatrix;

import java.util.Arrays;
import java.util.HashMap;

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

    public HashMap calculate() {
        HashMap map = new HashMap();

        int[] array = new int[super.matrix.length * super.matrix[0].length];
        int index = 0;
        int upElementQuantity = 0;
        int downElementQuantity = 0;
        int maxUpElementQuantity = 0;
        int maxDownElementQuantity = 0;
        int lastUpRangeElementIndex = 0;
        int lastDownRangeElementIndex = 0;


        for (int[] row : super.matrix) {
            for (int element : row) {
                array[index++] = element;
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                upElementQuantity++;

                if (upElementQuantity > maxUpElementQuantity) {
                    maxUpElementQuantity = upElementQuantity;
                    lastUpRangeElementIndex = i + 1;
                }
            } else {
                upElementQuantity = 0;
            }

            if (array[i] > array[i + 1]) {
                downElementQuantity++;

                if (downElementQuantity > maxDownElementQuantity) {
                    maxDownElementQuantity = downElementQuantity;
                    lastDownRangeElementIndex = i + 1;
                }
            } else {
                downElementQuantity = 0;
            }
        }

        map.put(
                "maxUpElementRange",
                Arrays.copyOfRange(
                        array,
                        lastUpRangeElementIndex - maxUpElementQuantity,
                        lastUpRangeElementIndex
                )
        );
        map.put(
                "maxDownElementRange",
                Arrays.copyOfRange(
                        array,
                        lastDownRangeElementIndex - maxDownElementQuantity,
                        lastDownRangeElementIndex
                )
        );

        return map;
    }
}