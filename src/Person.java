public class Person {

    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";

    private String fName;
    private String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
