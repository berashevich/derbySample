import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DbHelper {

    private static final String DB_NAME = "PROPERTIES";

    private static final String CREATE_CAMERA_TABLE = "CREATE table PROPERTIES.CAMERA (\n" +
            "    ID          INTEGER NOT NULL \n" +
            "                PRIMARY KEY GENERATED ALWAYS AS IDENTITY \n" +
            "                (START WITH 1, INCREMENT BY 1),\n" +
            "    TYPEBODY           VARCHAR(30) NOT NULL, \n" +
            "    MINLIGHT           DOUBLE NOT NULL, \n" +
            "    FREQUENCY          INTEGER NOT NULL, \n" +
            "    SIGNALRATIO        VARCHAR(30) NOT NULL, \n" +
            "    RESOLUTION         DOUBLE NOT NULL, \n" +
            "    ASPECTRATIO        DOUBLE NOT NULL, \n" +
            "    SIZEMATRIX         DOUBLE NOT NULL, \n" +
            "    VOLTAGE            VARCHAR(30) NOT NULL, \n" +
            "    SHOOTINGMODE       VARCHAR(30) NOT NULL, \n" +
            "    ALARMINOUT         VARCHAR(30) NOT NULL, \n" +
            "    COMPRESSIONIMAGE   VARCHAR(30) NOT NULL, \n" +
            "    LOWTEMP            INTEGER, \n" +
            "    HIGHTEMP           INTEGER, \n" +
            "    DAYNIGHTMODE       VARCHAR(30), \n" +
            "    IRLED              VARCHAR(30), \n" +
            "    SUPPORTAUDIO       VARCHAR(80))";


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

    public boolean createTables(Connection dbConnection) {
        boolean bCreatedTables = false;
        Statement statement;
        try {
            statement = dbConnection.createStatement();
            statement.execute(CREATE_CAMERA_TABLE);
            bCreatedTables = true;
        } catch (SQLException ex) {
            if (DerbyHelper.tableAlreadyExists(ex)) {
                return false;
            }
            ex.printStackTrace();
        }

        return bCreatedTables;
    }

    public static void addCamera(Camera camera) {
        Connection connection = null;
        PreparedStatement statement = null;
        String addCamera;

        try {
            Connection dbConnection = getDbConnection();

            statement = dbConnection.prepareStatement("INSERT INTO PROPERTIES.CAMERA (TYPEBODY, MINLIGHT, FREQUENCY, SIGNALRATIO, RESOLUTION, ASPECTRATIO, SIZEMATRIX, VOLTAGE, SHOOTINGMODE, ALARMINOUT, COMPRESSIONIMAGE) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1, camera.getTypebody().toString());
            statement.setDouble(2, camera.getMinLight());
            statement.setInt(3, camera.getFrequency());
            statement.setString(4, camera.getSignalratio().toString());
            statement.setDouble(5, camera.getResolution());
            statement.setDouble(6, camera.getAspectratio());
            statement.setDouble(7, camera.getSizematrix());
            statement.setString(8, camera.getVoltage());
            statement.setString(9, camera.getShootingmode().toString());
            statement.setString(10, camera.getAlarminout().toString());
            statement.setString(11, camera.getCompressionimage().toString());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addCameraExtra (Camera camera) {
        Connection connection = null;
        PreparedStatement statement = null;
        String addCameraExtra;

        try {
            Connection dbConnection = getDbConnection();

            statement = dbConnection.prepareStatement( "INSERT INTO PROPERTIES.CAMERA (TYPEBODY, MINLIGHT, FREQUENCY, SIGNALRATIO, RESOLUTION, ASPECTRATIO, SIZEMATRIX, VOLTAGE, SHOOTINGMODE, ALARMINOUT, COMPRESSIONIMAGE, LOWTEMP, HIGHTEMP, DAYNIGHTMODE, IRLED, SUPPORTAUDIO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1,camera.getTypebody().toString());
            statement.setDouble(2,camera.getMinLight());
            statement.setInt(3,camera.getFrequency());
            statement.setString(4,camera.getSignalratio().toString());
            statement.setDouble(5,camera.getResolution());
            statement.setDouble(6, camera.getAspectratio());
            statement.setDouble(7, camera.getSizematrix());
            statement.setString(8, camera.getVoltage());
            statement.setString(9, camera.getShootingmode().toString());
            statement.setString(10, camera.getAlarminout().toString());
            statement.setString(11, camera.getCompressionimage().toString());
            statement.setInt(12, camera.getLowtemp());
            statement.setInt(13, camera.getHightemp());
            statement.setString(14, camera.getDaynightmode().toString());
            statement.setString(15, camera.getIrled().toString());
            statement.setString(16, camera.getSupportaudio().toString());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    
    }

//    public static Collection<Person> getPersons() {
//        String selectModels = "SELECT " + Person.FIRST_NAME + ", " + Person.LAST_NAME + " FROM BOOK.PERSON";
//        Collection<Person> persons = new ArrayList<>();
//
//        try {
//            Connection dbConnection = getDbConnection();
//            Statement statement = dbConnection.createStatement();
//
//            ResultSet rs = statement.executeQuery(selectModels);
//
//            while (rs.next()) {
//                String lName = rs.getString(Person.LAST_NAME);
//                String fName = rs.getString(Person.FIRST_NAME);
//
//                persons.add(new Person(fName, lName));
//            }
//            return persons;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return persons;
//    }
//}
