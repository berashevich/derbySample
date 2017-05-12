package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum ShootingMode {
    COLOR(1),
    BW(2),
    COLORANDBW(3),
    ;

    private final int mId;

    ShootingMode(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }
}
