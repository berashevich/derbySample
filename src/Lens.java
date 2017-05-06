/**
 * Created by Анастасия on 06.05.2017.
 */
public class Lens {
    public enum TypeLens {Fix, Zoom}
    private TypeLens typelens;
    private double fixvalue;
    public enum ZoomMode {Min, Max}
    private ZoomMode zoommode;
    private double minvalue;
    private double maxvalue;
    public enum ApertureMode {Automatic, Manual}
    private ApertureMode aperturemode;
    private double aperturevalue;
    private double matrixformat;
    public enum MountingType {M12, CS, C}
    private MountingType mountingtype;

    public TypeLens getTypelens() {
        return typelens;
    }

    public void setTypelens(TypeLens typelens) {
        this.typelens = typelens;
    }

    public double getFixvalue() {
        return fixvalue;
    }

    public void setFixvalue(double fixvalue) {
        this.fixvalue = fixvalue;
    }

    public ZoomMode getZoommode() {
        return zoommode;
    }

    public void setZoommode(ZoomMode zoommode) {
        this.zoommode = zoommode;
    }

    public double getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(double minvalue) {
        this.minvalue = minvalue;
    }

    public double getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(double maxvalue) {
        this.maxvalue = maxvalue;
    }

    public ApertureMode getAperturemode() {
        return aperturemode;
    }

    public void setAperturemode(ApertureMode aperturemode) {
        this.aperturemode = aperturemode;
    }

    public double getAperturevalue() {
        return aperturevalue;
    }

    public void setAperturevalue(double aperturevalue) {
        this.aperturevalue = aperturevalue;
    }

    public double getMatrixformat() {
        return matrixformat;
    }

    public void setMatrixformat(double matrixformat) {
        this.matrixformat = matrixformat;
    }

    public MountingType getMountingtype() {
        return mountingtype;
    }

    public void setMountingtype(MountingType mountingtype) {
        this.mountingtype = mountingtype;
    }

    public Lens(TypeLens typelens, double matrixformat, MountingType mountingtype, ApertureMode aperturemode) {
        this.typelens = typelens;
        this.matrixformat = matrixformat;
        this.mountingtype = mountingtype;
        this.aperturemode = aperturemode;
    }

    public Lens(TypeLens typelens, double fixvalue, ZoomMode zoommode, double minvalue, double maxvalue, ApertureMode aperturemode, double aperturevalue, double matrixformat, MountingType mountingtype) {
        this.typelens = typelens;
        this.fixvalue = fixvalue;
        this.zoommode = zoommode;
        this.minvalue = minvalue;
        this.maxvalue = maxvalue;
        this.aperturemode = aperturemode;
        this.aperturevalue = aperturevalue;
        this.matrixformat = matrixformat;
        this.mountingtype = mountingtype;
    }
}
