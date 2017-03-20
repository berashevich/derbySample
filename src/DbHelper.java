import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DbHelper {

    private static final String DB_NAME = "PersonBook";

    private static final String CREATE_PERSON_TABLE = "CREATE table BOOK.PERSON (\n" +
            "    ID          INTEGER NOT NULL \n" +
            "                PRIMARY KEY GENERATED ALWAYS AS IDENTITY \n" +
            "                (START WITH 1, INCREMENT BY 1),\n" +
            "    " + Person.FIRST_NAME + "    VARCHAR(30), \n" +
            "    " + Person.LAST_NAME + "     VARCHAR(30) )";

    public DbHelper() {
        setDBSystemDir();
        loadDatabaseDriver("org.apache.derby.jdbc.EmbeddedDriver");
        createTables(getDbConnection());
    }

    private void setDBSystemDir() {
        // Set the derby db system directory.
        String userHomeDir = System.getProperty("user.home", ".");
        String systemDir = userHomeDir + "/.derby";
        System.setProperty("derby.system.home", systemDir);
    }

    private void loadDatabaseDriver(String driverName) {
        // Load the Java DB driver.
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getDbConnection() {
        try {
            return DriverManager.getConnection("jdbc:derby:" + DB_NAME + ";create=true");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean createTables(Connection dbConnection) {
        boolean bCreatedTables = false;
        Statement statement;
        try {
            statement = dbConnection.createStatement();
            statement.execute(CREATE_PERSON_TABLE);
            bCreatedTables = true;
        } catch (SQLException ex) {
            if (DerbyHelper.tableAlreadyExists(ex)) {
                return false;
            }
            ex.printStackTrace();
        }

        return bCreatedTables;
    }

    public static void addPerson(Person person) {
        String addPerson = "INSERT INTO BOOK.PERSON ("+ Person.LAST_NAME +", " + Person.FIRST_NAME + ") " +
                "VALUES ('" + person.getlName() + "', '" + person.getfName() + "')";

        try {
            Connection dbConnection = getDbConnection();
            Statement statement = dbConnection.createStatement();

            statement.executeUpdate(addPerson);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Collection<Person> getPersons() {
        String selectModels = "SELECT " + Person.FIRST_NAME + ", " + Person.LAST_NAME + " FROM BOOK.PERSON";
        Collection<Person> persons = new ArrayList<>();

        try {
            Connection dbConnection = getDbConnection();
            Statement statement = dbConnection.createStatement();

            ResultSet rs = statement.executeQuery(selectModels);

            while (rs.next()) {
                String lName = rs.getString(Person.LAST_NAME);
                String fName = rs.getString(Person.FIRST_NAME);

                persons.add(new Person(fName, lName));
            }
            return persons;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }
}
