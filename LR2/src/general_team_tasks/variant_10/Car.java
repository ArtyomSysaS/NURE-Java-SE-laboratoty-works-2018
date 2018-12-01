package general_team_tasks.variant_10;

import java.awt.*;
import java.text.MessageFormat;

public class Car {
    private String mark;
    private String number;
    private Color color;

    public Car(String mark, String number, Color color) {
        this.mark = mark;
        this.number = number;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Car'{'mark=''{0}'', number=''{1}'', color={2}'}'", mark, number, color);
    }
}
