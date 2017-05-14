package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum MountingType {
    M12(1),
    C(2),
    CS(3),
    ;

    private final int mId;

    MountingType (int Id) {
        mId = Id;
    }

    public int getId() {
        return mId;
    }
}
