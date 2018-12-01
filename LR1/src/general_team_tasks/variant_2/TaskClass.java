/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   07.10.2018              |
    -----------------------------
*/

package general_team_tasks.variant_2;

import GeneralClasses.IntegerArray;
import GeneralClasses.Point;
import GeneralClasses.PointArray;

import java.util.*;
import java.util.stream.IntStream;

public class TaskClass {
    static class ArrayOfPoints extends PointArray {
        public ArrayOfPoints(int size, boolean random) {
            super(size, random);
        }

        public ArrayOfPoints(int size, double fillValue) {
            super(size, fillValue);
        }

        public double calculate() {
            double maxDistance = 0;
            double currentDistance;

            for (Point currentPoint : super.array) {
                for (Point p : super.array) {
                    if (currentPoint.getX() != p.getX() && currentPoint.getY() != p.getY()) {
                        currentDistance = Math.sqrt(
                                Math.pow(currentPoint.getX() - p.getX(), 2) +
                                        Math.pow(currentPoint.getY() - p.getY(), 2)
                        );

                        maxDistance = Math.max(currentDistance, maxDistance);
                    }
                }
            }

            return maxDistance;
        }
    }

    static class Array extends IntegerArray {
        public Array(int size) {
            super(size);
        }

        public Array(int size, int fillValue) {
            super(size, fillValue);
        }

        public Array(int size, int minValue, int maxValue) {
            super(size, minValue, maxValue);
        }

        public void calculate() {
            int elementQuantity;
            List<Integer> result = new ArrayList<>();

            for (int element : IntStream.of(super.array).distinct().toArray()) {
                elementQuantity = 0;
                for (int e : super.array) {
                    if (e == element) elementQuantity++;
                }

                if (elementQuantity == 1) {
                    result.add(element);
                }
            }

            System.out.println(result.toString());
        }
    }
}