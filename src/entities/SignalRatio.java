package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum SignalRatio {
    WELL(1, 48, null),
    GOOD(2, 42, 47),
    MEDIOCRE(3, 38, 41),
    BAD(4, 31, 37),
    VERYBAD(5, 0, 30),
    ;

    private final int mId;
    private int mMinValue;
    private Integer mMaxValue;

    SignalRatio(int id, int MinValue, Integer MaxValue) {
        mId = id;
        mMinValue = MinValue;
        mMaxValue = MaxValue;
    }

    public int getId() {
        return mId;
    }

    public int getMinValue() {
        return mMinValue;
    }

    public Integer getMaxValue() {
        return mMaxValue;
    }
}
