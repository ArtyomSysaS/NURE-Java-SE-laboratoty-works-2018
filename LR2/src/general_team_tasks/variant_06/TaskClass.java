package general_team_tasks.variant_06;

import general_team_tasks.variant_06.Persons.Person;

import java.util.*;

public class TaskClass<T extends Person> {
    private List<Person> people;

    public TaskClass() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);

        this.people.sort(
                (o1, o2) ->
                        String.CASE_INSENSITIVE_ORDER.compare(
                                o1.getFirstName() + " " + o1.getLastName(),
                                o2.getFirstName() + " " + o2.getLastName()
                        )
        );
    }

    public void print() {
        this.people.forEach(person ->
                System.out.println(person.getName())
        );
    }
}
