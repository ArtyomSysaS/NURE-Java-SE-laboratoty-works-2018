/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    5. Создать приложение, запрашивающее пути и имена файла1, файла2 и файла3.
       Затем  приложение сливает все слова из файла1 и файла2, имеющие более 3-х символов.
       Результатом слияния является
 */

package general_team_tasks.variant_05;

import general_team_tasks.Utils;

public class Main {

    // Paths:
    //          "GroupTask5_input_file1.txt',
    //          "GroupTask5_input_file2.txt",
    //          "GroupTask5_input_file3.txt"

    public static void main(String[] args) {
        TaskClass.execute(
                Utils.readFilePath(),
                Utils.readFilePath(),
                Utils.readFilePath()
        );
    }
}
