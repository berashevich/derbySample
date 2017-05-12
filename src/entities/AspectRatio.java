package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum AspectRatio {
    VARONE(1, 4, 3),
    VARTWO(2, 16, 9),
    ;

    private final int mId;
    private int mValueA;
    private int mValueB;

    AspectRatio(int id, int ValueA, int ValueB) {
        mId = id;
        mValueA = ValueA;
        mValueB = ValueB;
    }

    public int getId() {
        return mId;
    }

    public int getValueA() {
        return mValueA;
    }

    public Integer getValueB() {
        return mValueB;
    }
}
