/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    15. Входной файл хранит квадратную матрицу по принципу: строка представляет собой число. Определить размерность.
        Построить 2-мерный массив, содержащий матрицу.
        Вывести исходную матрицу и результат ее поворота на 90˚ по часовой стрелке.
 */

package individual_tasks.variant_15;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask15_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
