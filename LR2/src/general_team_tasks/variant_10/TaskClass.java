package general_team_tasks.variant_10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class TaskClass {
    private LinkedList<Car> cars;

    public TaskClass() {
        this.cars = new LinkedList<>();
    }

    public TaskClass Add(Car car) {
        if (!this.cars.contains(car)) {
            this.cars.add(car);
        }

        return this;
    }

    public LinkedList<Car> getCarsByMark(String mark) {
        LinkedList<Car> result = new LinkedList<>();

        this.cars.stream().filter(car -> car.getMark().equalsIgnoreCase(mark)).forEach(result::add);

        return  result;
    }
}
