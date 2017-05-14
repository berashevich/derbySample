package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum  TypeLens {
    FIXIR(1),
    VARIABLE(2),
    ;

    private final int mId;

    TypeLens (int Id) {
        mId = Id;
    }

    public int getId() {
        return mId;
    }
}
