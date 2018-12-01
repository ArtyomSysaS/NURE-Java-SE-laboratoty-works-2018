package general_team_tasks.variant_06.Persons;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getName() {
        return "Студент: " +
                super.getFirstName() +
                " " +
                super.getLastName();
    }
}
