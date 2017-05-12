package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum IrLed {
    YES(1),
    NO(2),
    ;

    private final int mId;

    IrLed(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }
}
