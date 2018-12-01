/*
    -----------------------------
    |   By Artyom Sysa          |
    |                           |
    |   01.12.2018              |
    -----------------------------
*/

package general_team_tasks.variant_08;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskClass implements Serializable {
    private List<Student> studentList;

    public TaskClass() {
        this.studentList = new ArrayList<>();
    }

    TaskClass add(Student student) {
        this.studentList.add(student);

        return this;
    }

    public void execute() throws IOException, ClassNotFoundException {
        executeWrite();
        System.out.println("Результат поиска: ");
        executeRead().stream().filter(student -> student.getAvg_mark() > 4).forEach(System.out::println);
    }

    private ArrayList<Student> executeRead() throws IOException, ClassNotFoundException {
        ArrayList<Student> students;

        FileInputStream fileIn = new FileInputStream(Paths.get("Task8_result.txt").toString());
        ObjectInputStream in = new ObjectInputStream(fileIn);

        students = (ArrayList<Student>) in.readObject();

        in.close();

        return students;
    }

    private void executeWrite() throws IOException {
        FileOutputStream fileOut = new FileOutputStream(Paths.get("Task8_result.txt").toString());
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(this.studentList);
        out.close();

        fileOut.close();
    }
}
