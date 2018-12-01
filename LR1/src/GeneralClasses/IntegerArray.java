/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/
package GeneralClasses;

import java.util.Arrays;
import java.util.Random;

public class IntegerArray {
    protected int[] array;

    public IntegerArray(int size) {
        this.array = new int[size];

        fill(0);
    }

    public IntegerArray(int size, int fillValue) {
        this.array = new int[size];

        fill(fillValue);
    }

    public IntegerArray(int size, int minValue, int maxValue) {
        this.array = new int[size];

        fill(minValue, maxValue);
    }

    private void fill(int fillValue) {
        Arrays.fill(this.array, fillValue);
    }

    private void fill(int minValue, int maxValue) {
        Random random = new Random();

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.ints(minValue, maxValue + 1).limit(1).findFirst().getAsInt();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
