/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    4. Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
 */

package individual_tasks.variant_04;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask2-4_input_file.java"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
