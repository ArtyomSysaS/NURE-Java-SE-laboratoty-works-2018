package general_team_tasks.variant_02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TaskClass {
    private Set<int[]> set;

    private Comparator<int[]> comparator = (o1, o2) -> {
        if (o1.length > o2.length) return 1;
        if (o1.length < o2.length) return -1;
        return 0;
    };

    public Set getSet() {
        return set;
    }

    public TaskClass() {
        this.set = new TreeSet<>(this.comparator);
    }
}
