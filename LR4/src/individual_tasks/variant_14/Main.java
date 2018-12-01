/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    14. Входной файл содержит совокупность строк. Строка файла содержит строку квадратной матрицы.
        Ввести матрицу в двумерный массив (размер матрицы найти).
        Вывести исходную матрицу и результат ее транспонирования.
 */

package individual_tasks.variant_14;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask14_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
