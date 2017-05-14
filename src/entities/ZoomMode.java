package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum ZoomMode {
    MINVAL(1),
    MAXVAL(2),
    ;

    private final int mId;

    ZoomMode (int Id) {
        mId = Id;
    }

    public int getId() {
        return mId;
    }
}
