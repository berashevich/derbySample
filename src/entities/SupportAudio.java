package entities;

/**
 * Created by Анастасия on 13.05.2017.
 */
public enum SupportAudio {
    TWOWAYAUDIO(1),
    TWOWAYANDMICROPHONE(2),
    TWOWAYMICROPHONEANDLOUDSPEAKER(3),
    NONE(4),
    ;

    private final int mId;

    SupportAudio (int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }
}
