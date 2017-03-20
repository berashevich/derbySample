import java.util.Collection;

public class DerbyDemo {

    public static void main(String[] args) {
        new DbHelper();
//        DbHelper.addPerson(new Person("First", "Lastovich"));

        Collection<Person> persons = DbHelper.getPersons();
        persons.stream().forEach(person -> {
            System.out.println(person.getfName() + " " + person.getlName());
        });
    }
}