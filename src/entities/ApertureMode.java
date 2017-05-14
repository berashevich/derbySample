package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum ApertureMode {
    AUTOMATIC(1),
    MANUAL(2),
    ;

    private final int mId;

    ApertureMode (int Id) {
        mId = Id;
    }

    public int getId() {
        return mId;
    }
}
