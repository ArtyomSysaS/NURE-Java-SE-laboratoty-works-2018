package general_team_tasks.variant_08;

import java.io.Serializable;
import java.text.MessageFormat;

public class Student implements Serializable {
    private String fio;
    private String group;
    private double avg_mark;

    public Student(String fio, String group, double avg_mark) {
        this.fio = fio;
        this.group = group;
        this.avg_mark = avg_mark;
    }

    public double getAvg_mark() {
        return avg_mark;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Student'{'fio=''{0}'', group=''{1}'', avg_mark={2}'}'", fio, group, avg_mark);
    }
}
