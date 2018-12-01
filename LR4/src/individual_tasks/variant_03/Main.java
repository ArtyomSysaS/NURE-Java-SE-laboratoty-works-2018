/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    3. Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
 */

package individual_tasks.variant_03;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask2-4_input_file.java"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
