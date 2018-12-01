/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    10. Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.
 */

package individual_tasks.variant_10;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask10&11&16_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
