package individual_task.Models;

import java.text.MessageFormat;

public class Flower {
    private String name;
    private String type;

    public Flower() {
    }

    public Flower(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Flower'{'name=''{0}'', type=''{1}'''}'", name, type);
    }
}
