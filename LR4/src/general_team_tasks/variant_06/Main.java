/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    6.  Создать приложение, запрашивающее путь и имя_файла1, а также, с какой по какую строку.
        Необходимо вывести содержимое файла в коллекцию.
        После ввода строк, отобразить выбранные строки на экране.
 */

package general_team_tasks.variant_06;

import general_team_tasks.Utils;

public class Main {

    // Path: "GroupTask6&7_input_file.txt"

    public static void main(String[] args) {
        TaskClass utility = new TaskClass(
                Utils.readFilePath(),
                TaskClass.readLinesIndexes()
        );

        utility.execute();
    }



}
