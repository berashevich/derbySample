package entities;

public class Camera {
    private BodyType bodytype;
    private float minlight;
    private float frequency;
    private SignalRatio signalratio;
    private float resolution;
    private AspectRatio aspectratio;
    private float sizematrix;
    private Voltage voltage;
    private ShootingMode shootingmode;
    private AlarmInOut alarminout;
    private CompressionImage compressionimage;
    private float lowtemp;
    private float hightemp;
    private DayNightMode daynightmode;
    private IrLed irled;
    private SupportAudio supportaudio;

    public BodyType getBodytype() {
        return bodytype;
    }

    public void setBodytype(BodyType bodytype) {
        this.bodytype = bodytype;
    }

    public float getMinlight() {
        return minlight;
    }

    public void setMinlight(float minlight) {
        this.minlight = minlight;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public SignalRatio getSignalratio() {
        return signalratio;
    }

    public void setSignalratio(SignalRatio signalratio) {
        this.signalratio = signalratio;
    }

    public float getResolution() {
        return resolution;
    }

    public void setResolution(float resolution) {
        this.resolution = resolution;
    }

    public AspectRatio getAspectratio() {
        return aspectratio;
    }

    public void setAspectratio(AspectRatio aspectratio) {
        this.aspectratio = aspectratio;
    }

    public float getSizematrix() {
        return sizematrix;
    }

    public void setSizematrix(float sizematrix) {
        this.sizematrix = sizematrix;
    }

    public Voltage getVoltage() {
        return voltage;
    }

    public void setVoltage(Voltage voltage) {
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

    public float getLowtemp() {
        return lowtemp;
    }

    public void setLowtemp(float lowtemp) {
        this.lowtemp = lowtemp;
    }

    public float getHightemp() {
        return hightemp;
    }

    public void setHightemp(float hightemp) {
        this.hightemp = hightemp;
    }

    public DayNightMode getDaynightmode() {
        return daynightmode;
    }

    public void setDaynightmode(DayNightMode daynightmode) {
        this.daynightmode = daynightmode;
    }

    public IrLed getIrled() {
        return irled;
    }

    public void setIrled(IrLed irled) {
        this.irled = irled;
    }

    public SupportAudio getSupportaudio() {
        return supportaudio;
    }

    public void setSupportaudio(SupportAudio supportaudio) {
        this.supportaudio = supportaudio;
    }

    public Camera(float minlight, float frequency, BodyType bodytype, SignalRatio signalratio, float resolution, AspectRatio aspectratio, float sizematrix, Voltage voltage, ShootingMode shootingmode, AlarmInOut alarminout, CompressionImage compressionimage) {
        this.minlight = minlight;
        this.frequency = frequency;
        this.bodytype = bodytype;
        this.signalratio = signalratio;
        this.resolution = resolution;
        this.aspectratio = aspectratio;
        this.sizematrix = sizematrix;
        this.voltage = voltage;
        this.shootingmode = shootingmode;
        this.alarminout = alarminout;
        this.compressionimage = compressionimage;
    }

    public Camera(float minlight, float frequency, BodyType bodytype, SignalRatio signalratio, float resolution, AspectRatio aspectratio, float sizematrix, Voltage voltage, ShootingMode shootingmode, AlarmInOut alarminout, CompressionImage compressionimage, int lowtemp, int hightemp, DayNightMode daynightmode, IrLed irled, SupportAudio supportaudio) {
        this(minlight, frequency, bodytype, signalratio, resolution, aspectratio, sizematrix, voltage, shootingmode, alarminout, compressionimage);
        this.lowtemp = lowtemp;
        this.hightemp = hightemp;
        this.daynightmode = daynightmode;
        this.irled = irled;
        this.supportaudio = supportaudio;
    }
}
