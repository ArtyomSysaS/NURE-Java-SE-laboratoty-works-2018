/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    2. Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
 */

package individual_tasks.variant_02;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask2-4_input_file.java"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
