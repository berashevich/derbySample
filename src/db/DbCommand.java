package db;

public final class DbCommand {

    public static final String DB_NAME = "PROPERTIES";

    public static final String CREATE_CAMERA_TABLE = "CREATE table PROPERTIES.CAMERA (\n" +
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

    public static final String CREATE_LENS_TABLE = "CREATE table PROPERTIES.LENS (\n" +
            "    ID          INTEGER NOT NULL \n" +
            "                PRIMARY KEY GENERATED ALWAYS AS IDENTITY \n" +
            "                (START WITH 1, INCREMENT BY 1),\n" +
            "    TYPELENS           VARCHAR(30) NOT NULL, \n" +
            "    FIXVALUE           DOUBLE, \n" +
            "    ZOOMMODE           VARCHAR(30), \n" +
            "    MINVALUE           DOUBLE, \n" +
            "    MAXVALUE           INTEGER, \n" +
            "    APERTUREVALUE      DOUBLE, \n" +
            "    MATRIXFORMAT       DOUBLE NOT NULL, \n" +
            "    MOUNTINGTYPE       VARCHAR(30) NOT NULL)";

    public static final String ADD_CAMERA = "INSERT INTO PROPERTIES.CAMERA " +
            "(TYPEBODY, MINLIGHT, FREQUENCY, SIGNALRATIO, RESOLUTION, ASPECTRATIO, SIZEMATRIX, VOLTAGE, SHOOTINGMODE, " +
            "ALARMINOUT, COMPRESSIONIMAGE, LOWTEMP, HIGHTEMP, DAYNIGHTMODE, IRLED, SUPPORTAUDIO) " +
            "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String ADD_LENS = "INSERT INTO PROPERTIES.LENS (TYPELENS, FIXVALUE, ZOOMMODE, MINVALUE, " +
            "MAXVALUE, APERTUREVALUE, MATRIXFORMAT, MOUNTINGTYPE) " +
            "VALUES (?,?,?,?,?,?,?,?)";

}
