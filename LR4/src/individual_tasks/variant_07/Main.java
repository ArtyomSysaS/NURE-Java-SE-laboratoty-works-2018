/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    7. Из файла удалить все слова, содержащие от трех до пяти символов,
       но при этом из каждой строки должно быть удалено только максимальное четное количество таких слов.
 */

package individual_tasks.variant_07;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask7_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
