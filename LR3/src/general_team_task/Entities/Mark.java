package general_team_task.Entities;

import java.text.MessageFormat;

public class Mark {
    private String subject;
    private int value;

    public Mark(String subject, int value) {
        this.subject = subject;
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return MessageFormat.format("\n\tПредмет: {0}, Оценка: {1}", subject, value);
    }
}
