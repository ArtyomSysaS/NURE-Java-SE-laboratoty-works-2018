/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    16. В файле содержится совокупность строк.
        Найти номера строк, совпадающих с заданной строкой.
        Вывести строки файла и номера строк, совпадающих с заданной
 */

package individual_tasks.variant_16;

import individual_tasks.Utils;

public class Main {

    // Path:   "IndividualTask10&11&16_input_file.txt"
    // String: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus arcu purus, sagittis sed urna sodales, laoreet"

    public static void main(String[] args) {
        TaskClass.execute(
                Utils.readFilePath(),
                Utils.readConsoleValue("Введите сроку для поиска: ")
        );
    }


}
