/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    1. Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */

package individual_tasks.variant_01;

import individual_tasks.Utils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskClass.executeWrite(TaskClass.readFilePath(),
                Utils.readIntValueFromConsole("Введите минимальный предел случайных чисел: "),
                Utils.readIntValueFromConsole("Введите минимальный предел случайных чисел: ")
        );
    }
}
