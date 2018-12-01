/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    8. Прочитать текст Java-программы и удалить из него все «лишние» пробелы и табуляции,
       оставив только необходимые для разделения операторов.
 */

package individual_tasks.variant_08;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask8_input_file.java"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
