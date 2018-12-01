/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------

    5. В файле, содержащем фамилии студентов и их оценки, записать прописными буквами
       фамилии тех студентов, которые имеют средний балл более 7.
 */

package individual_tasks.variant_05;

import individual_tasks.Utils;

public class Main {

    // Path: "IndividualTask5_input_file.txt"

    public static void main(String[] args) {
        TaskClass.execute(Utils.readFilePath());
    }
}
