import com.sun.deploy.util.StringUtils;

/**
 * Created by Анастасия on 12.05.2017.
 */
public enum bodyTypeId {

    STRANGER_AUTHENTICATION(1),
    FAMILIAR_AUTHENTICATION(2),
    PARTS_RECOGNITION(3),
    IDENTIFICATION(4),
    MONITORING(5),
    ;

    private final int mId;

    bodyTypeId(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

   }
