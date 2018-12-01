package general_team_tasks.variant_11;

import java.text.MessageFormat;

public class Building {
    private String id;
    public int floors;

    public Building(String id, int floors) {
        this.id = id;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Building'{'id=''{0}'', floors={1}'}'", id, floors);
    }
}
