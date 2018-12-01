package general_team_tasks.variant_09;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskClass {
    private List<Sportsman> sportsmen;

    public TaskClass() {
        this.sportsmen = new LinkedList<>();
    }

    public void Add(Sportsman sportsman) {
        this.sportsmen.add(sportsman);
    }

    public void AddAll(List<Sportsman> sportsman) {
        this.sportsmen.addAll(sportsman);
    }

    public List<Sportsman> filter(Predicate<Sportsman> predicate) {
        return
                this.sportsmen
                        .stream()
                        .filter(predicate)
                        .collect(Collectors.toList());
    }

    public List<Sportsman> filter(FilterType filterType, Object filterParam) {
        switch (filterType) {
            case FILTER_BY_ID:
                return this.sportsmen
                        .stream()
                        .filter(sportsman -> sportsman.getId() == (int) filterParam)
                        .collect(Collectors.toList());
            case FILTER_BY_SECOND_NAME:
                return this.sportsmen
                        .stream()
                        .filter(
                                sportsman ->
                                        sportsman
                                                .getSecondName()
                                                .toLowerCase()
                                                .equals(
                                                        ((String) filterParam).toLowerCase()
                                                )
                        )
                        .collect(Collectors.toList());
            default:
                return null;
        }
    }
}
