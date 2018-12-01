/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package general_team_tasks.variant_09;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TaskClass implements Serializable {
    private ArrayList<Car> carList;

    public TaskClass() {
        this.carList = new ArrayList<>();
    }

    public TaskClass add(Car car) {
        this.carList.add(car);

        return this;
    }

    public void execute() throws IOException, ClassNotFoundException {
        executeWrite();
        ArrayList<Car> result = executeRead();

        System.out.println("Содержимое файла");
        result.forEach(System.out::println);
    }

    private void executeWrite() throws IOException {
        FileOutputStream fileOut = new FileOutputStream(Paths.get("Task9_result.txt").toString());
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(this.carList);
        out.close();

        fileOut.close();
    }

    private ArrayList<Car> executeRead() throws IOException, ClassNotFoundException {
        ArrayList<Car> cars;

        FileInputStream fileIn = new FileInputStream(Paths.get("Task9_result.txt").toString());
        ObjectInputStream in = new ObjectInputStream(fileIn);

        cars = (ArrayList<Car>) in.readObject();

        in.close();

        return cars;
    }
}
