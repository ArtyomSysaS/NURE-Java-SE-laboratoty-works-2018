/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    7. Создать программу, которая позволяет заменить в текстовом файле все вхождения подстроки1 на подстроку2.
       Подстроки вводятся пользователем с клавиатуры.
       Содержимое результирующего файла вывести в коллекцию и на экран.
 */

package general_team_tasks.variant_07;

import general_team_tasks.Utils;

public class Main {

    // Path: "GroupTask6&7_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(
                Utils.readFilePath(),
                Utils.readConsoleValue("Введите значение подстроки, которое необходимо заменить: "),
                Utils.readConsoleValue("Введите значение подстроки, на которое необходимо вышеуказанную строку: ")
        );
    }
}
