import     javafx.util.Pair;

import           java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Path;


import java.nio.file.Paths;


import java.util.Scanner;

import java.util.stream.Stream;


public  class Main {
    public static void main(String[] args) {
        Utility     utility = new Utility(
                readFilePath(),
                readLinesIndexes()
        );

        utility.    execute();
    }

    private static int    readInt(String msg) {
        Scanner     scanner = new Scanner(System.in);



        int value = 1;

        do {
            if (value < 1) System.out.println("Индекс должен быть больше 0!");

            do {
                System.out.print(msg);
            } while (!scanner.hasNextInt());




            System.out.println();

        } while ((value = scanner.nextInt()) < 1);

        return value;
    }

    private static Path readFilePath() {
        Scanner scanner = new Scanner(System.in);
        boolean fileExists = true;
        boolean isDirectory = false;
        boolean repeat;
        Path path;


        do {
            repeat = false;
            if (!fileExists)            System.out.println("Файла с введённым адресом не существует. Повторите ещё раз.");
            if (isDirectory)               System.out.println("Необходимо ввести путь к файлу, а не к директории");

            do {
                System.out.print("Введите путь файла: ");
            } while (!scanner.hasNextLine());

            path = Paths.             get(scanner.nextLine());

            isDirectory = Files.isDirectory(path);
            fileExists = Files.                exists(path);

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

    private static Pair<Integer, Integer> readLinesIndexes() {
        int firstLineIndex;
        int secondLineIndex;

        do {
            firstLineIndex = readInt("Введите номер строки, начиная с которой включительно нужно вывести строки: ");
            secondLineIndex = readInt("Введите номер строки, начиная  до которой включительно нужно вывести строки: ");

            if (firstLineIndex > secondLineIndex) {
                System.out.println("Индекс строки с которой необходимо прооизвести вывод не можеть быть больше чем номер строки до которой выполняеться вывод!");
            }

            System.out.println();
        } while (firstLineIndex > secondLineIndex);

        return new Pair<>(firstLineIndex, secondLineIndex);
    }
}

class Utility {
    public Path _filePath;
    public int _startRowNumber;
    public int _endRowNumber;

    Utility(Path _filePath, Pair<Integer, Integer> indexes) {
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
}