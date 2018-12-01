/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    11. Ввести из текстового файла, связанного с входным потоком, последовательность строк.
        Выбрать и сохранить m последних слов в каждой из последних n строк.
 */

package individual_tasks.variant_11;

import individual_tasks.Utils;

import java.io.IOException;

public class Main {

    // Path: "IndividualTask10&11&16_input_file.txt"

    public static void main(String[] args) throws IOException {
        TaskClass.execute(Utils.readFilePath(),
                Utils.readIntValueFromConsole("Введите кол-во последних строк, из которых нужно сохранить слова: "),
                Utils.readIntValueFromConsole("Введите кол-во последних слов, которых нужно сохранить из " +
                        "вышеуказанного кол-ва послежних строк: ")
        );
    }
}
