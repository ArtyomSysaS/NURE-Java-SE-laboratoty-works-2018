/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package general_team_tasks.variant_06;

import general_team_tasks.Utils;
import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

class TaskClass {
    private Path _filePath;
    private int _startRowNumber;
    private int _endRowNumber;

    TaskClass(Path _filePath, Pair<Integer, Integer> indexes) {
        this._filePath = _filePath;
        this._startRowNumber = indexes.getKey();
        this._endRowNumber = indexes.getValue();
    }

    void execute() {
        System.out.println();

        try (Stream<String> stringStream = Files.lines(_filePath)) {
            stringStream.skip(_startRowNumber - 1).limit(_endRowNumber - _startRowNumber + 1).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Pair<Integer, Integer> readLinesIndexes() {
        int firstLineIndex;
        int secondLineIndex;

        do {
            firstLineIndex = Utils.readInt("Введите номер строки, начиная с которой включительно нужно вывести строки: ");
            secondLineIndex = Utils.readInt("Введите номер строки, начиная  до которой включительно нужно вывести строки: ");

            if (firstLineIndex > secondLineIndex) {
                System.out.println("Индекс строки с которой необходимо прооизвести вывод не можеть быть больше чем номер строки до которой выполняеться вывод!");
            }

            System.out.println();
        } while (firstLineIndex > secondLineIndex);

        return new Pair<>(firstLineIndex, secondLineIndex);
    }

    public static Path readFilePath() {
        Scanner scanner = new Scanner(System.in);
        boolean fileExists = true;
        boolean isDirectory = false;
        boolean repeat;
        Path path;


        do {
            repeat = false;
            if (!fileExists) System.out.println("Файла с введённым адресом не существует. Повторите ещё раз.");
            if (isDirectory) System.out.println("Необходимо ввести путь к файлу, а не к директории");

            do {
                System.out.print("Введите путь файла: ");
            } while (!scanner.hasNextLine());

            path = Paths.get(scanner.nextLine());

            isDirectory = Files.isDirectory(path);
            fileExists = Files.exists(path);

            if (!fileExists) {
                repeat = true;
            } else {
                if (isDirectory) {
                    repeat = true;
                }
            }

            System.out.println();
        } while (repeat);

        return path;
    }
}