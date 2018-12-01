package general_team_tasks.variant_01;

import Utilities.Utilities;

import java.util.*;

public class TaskClass {
    private Set<Point> set;

    private Comparator<Point> comparator = (o1, o2) -> {
        double firstDistance = Utilities.calculateDistanceBetweenPoints(o1.getX(), o1.getY(), 0, 0);
        double secondDistance = Utilities.calculateDistanceBetweenPoints(o2.getX(), o2.getY(), 0, 0);

        if (firstDistance > secondDistance) return 1;
        if (firstDistance < secondDistance) return -1;

        return 0;
    };

    public Set<Point> getSet() {
        return set;
    }

    public TaskClass() {
        this.set = new TreeSet<>(this.comparator);
    }

    public void Sort() {
        List<Point> list = new ArrayList<>(this.set);

        Collections.sort(list);

        this.set = new TreeSet<>();
        this.set.addAll(list);
    }
}
