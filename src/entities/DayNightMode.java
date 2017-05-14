package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum DayNightMode {
    YES(1),
    NO(2),
    ;

    private final int mId;

    DayNightMode(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

}
