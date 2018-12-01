/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    6. Файл содержит символы, слова, целые числа и числа с плавающей запятой.
       Определить все данные, тип которых вводится из командной строки.
 */

package individual_tasks.variant_06;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask6_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath(), TaskClass.readType());
    }
}
