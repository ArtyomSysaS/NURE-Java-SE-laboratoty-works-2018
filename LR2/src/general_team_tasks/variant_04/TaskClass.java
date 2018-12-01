package general_team_tasks.variant_04;

import java.util.Map;
import java.util.TreeMap;

public class TaskClass {
    private Map<String, Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }


    public TaskClass(String text, int range) {
        this.map = new TreeMap<>();

        generateMapContent(text, range);
    }


    private void generateMapContent(String text, int range) {
        String modifyString;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                stringBuilder.append(text.charAt(i));
            }
        }

        modifyString = stringBuilder.toString();

        for (int i = 0; i < modifyString.length() - (range - 1); i++) {
            String substring = modifyString.substring(i, i + range).toLowerCase();

            if (text.toLowerCase().contains(substring)) {
                this.map.put(
                        substring,
                        this.map.getOrDefault(substring, 0) + 1
                );
            }
        }
    }

    public int getCombinationQuantity(String combination) {
        return this.map.getOrDefault(combination, 0);
    }

}