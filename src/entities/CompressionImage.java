package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum CompressionImage {
    MOTIONJPEG(1),
    MPEG4(2),
    H264(3),
    H265(4),
    ;

    private final int mId;

    CompressionImage(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }
}
