package entities;

/**
 * Created by Анастасия on 14.05.2017.
 */
public enum SizeMatrix {
    TYPEONE(1, 1),
    TYPETWO(2, 1.8),
    TYPETHREE(3, 2),
    TYPEFOUR(4, 2.5),
    TYPEFIVE(5, 2.7),
    TYPESIX(6, 2.8),
    TYPESEVEN(7, 3),
    TYPEEIGHT(8, 3.2),
    TYPENINE(9, 3.4),
    TYPETEN(10, 3.6),
    TYPEELEVEN(11, 4),
    TYPETWELVE(12, 4.7),
    TYPETHIRTEEN(13, 6),
    ;

    private final int mId;
    private double mType;

    SizeMatrix(int id, double Type) {
        mId = id;
        mType = Type;
    }

    public int getId() {
        return mId;
    }

    public double getType() {
        return mType;
    }

}
