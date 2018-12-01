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

public class PointArray {
    protected Point[] array;

    public PointArray(int size, boolean random) {
        this.array = new Point[size];
        if (random) {
            fill();
        } else {
            fill(0);
        }
    }

    public PointArray(int size, double fillValue) {
        this.array = new Point[size];

        fill(fillValue);
    }

    private void fill(double fillValue) {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = new Point(fillValue, fillValue);
        }
    }

    private void fill() {
        Random random = new Random();

        for (int i = 0; i < this.array.length; i++) {
            int firstMin = random.nextInt(10);
            int firstMax = firstMin + random.nextInt(10);

            int secondMin = random.nextInt(10);
            int secondMax = secondMin + random.nextInt(10);
            this.array[i] = new Point(
                    Math.floor(random.doubles(firstMin, firstMax + 1).limit(1).findFirst().getAsDouble() * 100) / 100,
                    Math.floor(random.doubles(secondMin, secondMax + 1).limit(1).findFirst().getAsDouble() * 100) / 100
            );
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Point point : this.array) {
            stringBuilder
                    .append("(")
                    .append(point.getX())
                    .append(", ")
                    .append(point.getY())
                    .append(") ");
        }

        return stringBuilder.toString();
    }
}
