package db;

import entities.Camera;
import entities.Lens;

import java.sql.*;

import static db.DbCommand.*;

public final class DbHelper implements IVideoSystemDbHelper {

    private static final DbHelper INSTANCE = new DbHelper();

    public static IVideoSystemDbHelper getInstance() {
        return INSTANCE;
    }

    private DbHelper() {
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

    private Connection getDbConnection() {
        try {
            return DriverManager.getConnection("jdbc:derby:" + DB_NAME + ";create=true");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void createTables(Connection dbConnection) {
        createTable(dbConnection, CREATE_CAMERA_TABLE);
        createTable(dbConnection, CREATE_LENS_TABLE);
    }

    private boolean createTable(Connection dbConnection, String sql) {
        Statement statement;
        try {
            statement = dbConnection.createStatement();
            statement.execute(sql);
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
//            if (DerbyHelper.tableAlreadyExists(ex)) System.out.print("Table already exists");
            return false;
        }
    }

    @Override
    public void addCamera(Camera camera) {
        try {
            Connection dbConnection = getDbConnection();

            PreparedStatement statement = dbConnection.prepareStatement(ADD_CAMERA);
            statement.setString(1, camera.getTypebody().toString());
            statement.setDouble(2, camera.getMinLight());
            statement.setInt(3, camera.getFrequency());
            statement.setString(4, camera.getSignalratio().toString());
            statement.setDouble(  5, camera.getResolution());
            statement.setDouble(  6, camera.getAspectratio());
            statement.setDouble(7, camera.getSizematrix());
            statement.setString(  8, camera.getVoltage());
            statement.setString(  9, camera.getShootingmode().toString());
            statement.setString( 10, camera.getAlarminout().toString());
            statement.setString(11, camera.getCompressionimage().toString());
            statement.setInt(    12, camera.getLowtemp());
            statement.setInt(13, camera.getHightemp());
            statement.setString( 14, camera.getDaynightmode() != null ? camera.getDaynightmode().toString() : null);
            statement.setString( 15, camera.getIrled() != null ? camera.getIrled().toString() : null);
            statement.setString( 16, camera.getSupportaudio() != null ? camera.getSupportaudio().toString() : null);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addLens(Lens lens) {
        try {
            Connection dbConnection = getDbConnection();

            PreparedStatement statement = dbConnection.prepareStatement(ADD_LENS);
            statement.setString( 1, lens.getTypelens().toString());
            statement.setDouble(2, lens.getFixvalue());
            statement.setString(3, lens.getZoommode().toString());
            statement.setDouble(4, lens.getMinvalue());
            statement.setInt(5, lens.getMaxvalue());
            statement.setString(6, lens.getAperturemode().toString());
            statement.setDouble(7, lens.getAperturevalue());
            statement.setDouble( 8, lens.getMatrixformat());
            statement.setString(9, lens.getMountingtype().toString());
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
