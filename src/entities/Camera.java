package entities;

public class Camera {
    public enum Typebody {KUPOL, CILINDR, POVOROT, SKRYT, OTHER}
    private double minLight;
    private int frequency;
    private Typebody typebody;
    public enum SignalRatio {EXCELLENT, GOOD, MEDIOCRE, BAD, VERY_BAD}
    private SignalRatio signalratio;
    private double resolution;
    private double aspectratio;
    private double sizematrix;
    private String voltage;
    public enum ShootingMode {COLOR, BW, BW_AND_COLOR}
    private ShootingMode shootingmode;
    public enum AlarmInOut {NONE, ONE_ONE, CUSTOM_TWO_TWO, CUSTOM_FOUR_FOUR}
    private AlarmInOut alarminout;
    public enum CompressionImage {MOTION_JPEG, MPEG_4, H264, H265}
    private CompressionImage compressionimage;
    private int lowtemp;
    private int hightemp;
    public enum DayNightMode {YES, NO}
    private DayNightMode daynightmode;
    public enum IRled {YES, NO}
    private IRled irled;
    public enum SupportAudio {TWO_WAY_AUDIO, TWO_WAY_AUDIO_AND_MICROPHONE, TWO_WAY_AUDIO_WITH_MICROPHONE_AND_LOUDSPEAKER, NONE}
    private SupportAudio supportaudio;

        public Typebody getTypebody() {
        return typebody;
    }

    public void setTypebody(Typebody typebody) {
        this.typebody = typebody;
    }

    public double getMinLight() {
        return minLight;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int friquency) {
        this.frequency = friquency;
    }

    public void setMinLight(double minLight) {
        this.minLight = minLight;
    }

    public SignalRatio getSignalratio() {
        return signalratio;
    }

    public void setSignalratio(SignalRatio signalratio) {
        this.signalratio = signalratio;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public double getAspectratio() {
        return aspectratio;
    }

    public void setAspectratio(double aspectratio) {
        this.aspectratio = aspectratio;
    }

    public double getSizematrix() {
        return sizematrix;
    }

    public void setSizematrix(double sizematrix) {
        this.sizematrix = sizematrix;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public ShootingMode getShootingmode() {
        return shootingmode;
    }

    public void setShootingmode(ShootingMode shootingmode) {
        this.shootingmode = shootingmode;
    }

    public AlarmInOut getAlarminout() {
        return alarminout;
    }

    public void setAlarminout(AlarmInOut alarminout) {
        this.alarminout = alarminout;
    }

    public CompressionImage getCompressionimage() {
        return compressionimage;
    }

    public void setCompressionimage(CompressionImage compressionimage) {
        this.compressionimage = compressionimage;
    }

    public int getLowtemp() {
        return lowtemp;
    }

    public void setLowtemp(int lowtemp) {
        this.lowtemp = lowtemp;
    }

    public int getHightemp() {
        return hightemp;
    }

    public void setHightemp(int hightemp) {
        this.hightemp = hightemp;
    }

    public DayNightMode getDaynightmode() {
        return daynightmode;
    }

    public void setDaynightmode(DayNightMode daynightmode) {
        this.daynightmode = daynightmode;
    }

    public IRled getIrled() {
        return irled;
    }

    public void setIrled(IRled irled) {
        this.irled = irled;
    }

    public SupportAudio getSupportaudio() {
        return supportaudio;
    }

    public void setSupportaudio(SupportAudio supportaudio) {
        this.supportaudio = supportaudio;
    }

    public Camera(double minLight, int frequency, Typebody typebody, SignalRatio signalratio, double resolution, double aspectratio, double sizematrix, String voltage, ShootingMode shootingmode, AlarmInOut alarminout, CompressionImage compressionimage) {
        this.minLight = minLight;
        this.frequency = frequency;
        this.typebody = typebody;
        this.signalratio = signalratio;
        this.resolution = resolution;
        this.aspectratio = aspectratio;
        this.sizematrix = sizematrix;
        this.voltage = voltage;
        this.shootingmode = shootingmode;
        this.alarminout = alarminout;
        this.compressionimage = compressionimage;
    }

    public Camera(double minLight, int frequency, Typebody typebody, SignalRatio signalratio, double resolution, double aspectratio, double sizematrix, String voltage, ShootingMode shootingmode, AlarmInOut alarminout, CompressionImage compressionimage, int lowtemp, int hightemp, DayNightMode daynightmode, IRled irled, SupportAudio supportaudio) {
        this(minLight, frequency, typebody, signalratio, resolution, aspectratio, sizematrix, voltage, shootingmode, alarminout, compressionimage);
        this.lowtemp = lowtemp;
        this.hightemp = hightemp;
        this.daynightmode = daynightmode;
        this.irled = irled;
        this.supportaudio = supportaudio;
    }
}
