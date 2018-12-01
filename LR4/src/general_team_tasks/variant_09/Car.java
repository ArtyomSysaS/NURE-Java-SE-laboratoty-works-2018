package general_team_tasks.variant_09;

import java.awt.*;
import java.io.Serializable;
import java.text.MessageFormat;

public class Car implements Serializable {
    private String number;
    private String mark;
    private Color color;

    public Car(String number, String mark, Color color) {
        this.number = number;
        this.mark = mark;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Car'{'number=''{0}'', mark=''{1}'', color={2}'}'", number, mark, color);
    }
}
