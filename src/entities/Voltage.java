package entities;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum Voltage {
    TYPEONE(1, 12, "VDC"),
    TYPETWO(2, 24, "VDC"),
    TYPETHREE(3, 12, "VAC"),
    TYPEFOUR(4, 220, "VAC" +
            "" +
            ""),
    ;

    private final int mId;
    private int mValue;
    private java.lang.String mTypeVolt;

    Voltage(int id, int Value, java.lang.String TypeVolt) {
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

    public java.lang.String getTypeVolt() {
        return mTypeVolt;
    }
}
