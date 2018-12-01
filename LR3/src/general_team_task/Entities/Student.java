package general_team_task.Entities;

import java.text.MessageFormat;
import java.util.LinkedList;

public class Student {
    private String FIO;
    private String clazz;
    private int age;

    private LinkedList<Mark> marks;

    public Student(String FIO, String clazz, int age) {
        this.FIO = FIO;
        this.clazz = clazz;
        this.age = age;

        this.marks = new LinkedList<>();
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LinkedList<Mark> getMarks() {
        return marks;
    }

    public  void addMark(Mark mark){
        this.marks.add(mark);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(MessageFormat.format("ФИО: {0}, класс: {1}, возраст  : {2}", FIO, clazz, age));

        builder.append("\n");

        builder.append(marks.toString()).append("\n");

        return builder.toString();
    }
}
