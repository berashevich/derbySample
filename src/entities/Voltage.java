package entities;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum Voltage {
    TYPEONE(1, 12, ),
    TYPETWO(2, 24),
    TYPETHREE(3, 12),
    TYPEFOUR(4, 220),
    ;

    private final int mId;
    private int mValue;
    private String mTypeVolt;

    Voltage(int id, int Value, String TypeVolt) {
        mId = id;
        mValue = Value;
        mTypeVolt = TypeVolt;
    }

    public int getId() {
        return mId;
    }

    public int getValue() {
        return mValue;
    }

    public String getTypeVolt() {
        return mTypeVolt;
    }
}
