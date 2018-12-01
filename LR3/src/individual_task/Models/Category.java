package individual_task.Models;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private  String name;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    List<Flower> flowers;

    public Category(String name) {
        this.name = name;

        flowers = new ArrayList<>();
    }

    public Category() {
        flowers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Category'{'name=''{0}'''}'", this.name);
    }
}
