package general_team_tasks.variant_06.Persons;

public class Teacher extends Person {
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getName() {
        return "Учитель: " +
                super.getFirstName() +
                " " +
                super.getLastName();
    }
}
