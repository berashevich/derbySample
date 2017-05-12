package db;

import java.sql.SQLException;

public class DerbyHelper {

    public static boolean tableAlreadyExists(SQLException ex) {
        return ex.getSQLState().equals("X0Y32");
    }
}
