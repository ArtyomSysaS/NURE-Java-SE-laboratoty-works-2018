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

public class DoubleArray {
    protected double[] array;

    public DoubleArray(int size) {
        this.array = new double[size];

        fill(0);
    }

    public DoubleArray(int size, int fillValue) {
        this.array = new double[size];

        fill(fillValue);
    }

    public DoubleArray(int size, double minValue, double maxValue) {
        this.array = new double[size];

        fill(minValue, maxValue);
    }

    private void fill(double fillValue) {
        Arrays.fill(this.array, fillValue);
    }

    private void fill(double minValue, double maxValue) {
        Random random = new Random();

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = Math.floor(
                    random.doubles(minValue, maxValue + 1).limit(1).findFirst().getAsDouble() * 100
            ) / 100;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
