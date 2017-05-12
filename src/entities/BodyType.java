package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum BodyType {
    KUPOL(1),
    CILINDRICAL(2),
    ROTATE(3),
    HIDDEN(4),
    OTHER(5),
    ;

    private final int mId;

    BodyType(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }
}
