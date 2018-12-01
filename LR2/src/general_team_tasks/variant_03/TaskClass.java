/*
    Вариант 3

    •	Создать класс, который в конструкторе принимал бы п редложение (одну строку - набор слов, разделенных пробелами) и предоставлял методы для получения количества слов в предложении, а также словаря использованных слов в алфавитном порядке без учета регистра
 */

package general_team_tasks.variant_03;

import java.util.*;

public class TaskClass {
    private Map<String, Integer> map;
    private int totalWordQuantity;

    public TaskClass(String text) {
        String[] strings = text.split("\\s+");

        this.map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        this.totalWordQuantity = strings.length;


        for (String string : strings) {
            this.map.put(
                    string,
                    this.map.getOrDefault(string, 0) + 1
            );
        }
    }

    public Map<String, Integer> getMap() {
        return this.map;
    }

    public int getTotalWordQuantity() {
        return this.totalWordQuantity;
    }
}
