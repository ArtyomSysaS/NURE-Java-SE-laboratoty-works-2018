/*
    Вариант 2.

        Создать множество одномерных целых массивов, упорядоченных по количеству элементов в них.
        Меньшим считается тот массив, в котором элементов меньше
 */

package general_team_tasks.variant_02;

import Utilities.Utilities;

import java.util.*;

public class Main {
    private static final int MAX_SET_CONTENT_QUANTITY = 20;
    private static final int MIN_SET_CONTENT_QUANTITY = 10;
    private static final int MAX_SET_CONTENT_LENGTH = 20;
    private static final int SET_CONTENT_MAXIMUM = 100;
    private static final int SET_CONTENT_MINIMUM = 0;


    public static void main(String[] args) {
        TaskClass taskClass = new TaskClass();
        Random random = new Random();

        for (int i = 0; i < Utilities.getRandomValue(MIN_SET_CONTENT_QUANTITY, MAX_SET_CONTENT_QUANTITY); i++) {
            int[] ints = new int[random.nextInt(MAX_SET_CONTENT_LENGTH)];

            for (int j = 0; j < ints.length; j++) {
                ints[j] = Utilities.getRandomValue(SET_CONTENT_MINIMUM,SET_CONTENT_MAXIMUM);
            }

            taskClass.getSet().add(ints);
        }


        for (int[] o : (Iterable<int[]>) taskClass.getSet()) {
            System.out.println(Arrays.toString(o));
        }
    }
}
