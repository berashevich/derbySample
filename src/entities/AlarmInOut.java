package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum AlarmInOut {
    ONEINOUT(1),
    TWOINOUT(2),
    FOURINOUT(3),
    NONE(4),
    ;

    private final int mId;

    AlarmInOut(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }
}
