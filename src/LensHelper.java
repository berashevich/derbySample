/**
 * Created by Анастасия on 06.05.2017.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class LensHelper {

    private static final String DB_NAME = "PROPERTIES";

    private static final String CREATE_LENS_TABLE = "CREATE table PROPERTIES.LENS (\n" +
            "    ID          INTEGER NOT NULL \n" +
            "                PRIMARY KEY GENERATED ALWAYS AS IDENTITY \n" +
            "                (START WITH 1, INCREMENT BY 1),\n" +
            "    TYPELENS           VARCHAR(30) NOT NULL, \n" +
            "    FIXVALUE           DOUBLE, \n" +
            "    ZOOMMODE           VARCHAR(30), \n" +
            "    MINVALUE           DOUBLE, \n" +
            "    MAXVALUE           INTEGER, \n" +
            "    APERTUREMODE       VARCHAR(30), \n" +
            "    APERTUREVALUE      DOUBLE, \n" +
            "    MATRIXFORMAT       DOUBLE NOT NULL, \n" +
            "    MOUNTINGTYPE       VARCHAR(30) NOT NULL)";

    public LensHelper() {
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
            statement.execute(CREATE_LENS_TABLE);
            bCreatedTables = true;
        } catch (SQLException ex) {
            if (DerbyHelper.tableAlreadyExists(ex)) {
                return false;
            }
            ex.printStackTrace();
        }

        return bCreatedTables;
    }


    public static void addLens(Lens lens) {
        Connection connection = null;
        PreparedStatement statement = null;
        String addLens;

        try {
            Connection dbConnection = getDbConnection();

            statement = dbConnection.prepareStatement("INSERT INTO PROPERTIES.LENS (TYPELENS, FIXVALUE, ZOOMMODE, MINVALUE, MAXVALUE, APERTUREMODE, APERTUREVALUE, MATRIXFORMAT, MOUNTINGTYPE) VALUES (?,?,?,?,?,?,?,?,?)");
            statement.setString(1, lens.getTypelens().toString());
            statement.setDouble(2, lens.getFixvalue());
            statement.setString(3, lens.getZoommode().toString());
            statement.setDouble(4, lens.getMinvalue());
            statement.setInt(5, lens.getMaxvalue());
            statement.setString(6, lens.getAperturemode().toString());
            statement.setDouble(7, lens.getAperturevalue());
            statement.setDouble(8, lens.getMatrixformat());
            statement.setString(9, lens.getMountingtype().toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}