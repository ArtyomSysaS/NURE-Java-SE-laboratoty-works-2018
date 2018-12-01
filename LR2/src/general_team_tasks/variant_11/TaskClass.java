package general_team_tasks.variant_11;

import java.util.*;

public class TaskClass<T extends Building> {
    private List<T> set = new LinkedList<>();

    private Comparator<T> comparator = (o1, o2) -> {
        if (o1.floors > o2.floors) return 1;
        if (o1.floors < o2.floors) return -1;
        return 0;
    };

    public TaskClass Add(T t){
        if(!set.contains(t)){
            set.add(t);
        }

        return  this;
    }

    public LinkedList<T> getSortedBuilding(){
        LinkedList<T> result = new LinkedList<>();
        result.addAll(set);
        result.sort(comparator);

        return result;
    }
}
