package entities;

public class Lens {
    private TypeLens typelens;
    private float fixvalue;
    private float minvalue;
    private float maxvalue;
    private ApertureMode aperturemode;
    private float aperturevalue;
    private float matrixformat;
    private MountingType mountingtype;

    public TypeLens getTypelens() {
        return typelens;
    }

    public void setTypelens(TypeLens typelens) {
        this.typelens = typelens;
    }

    public float getFixvalue() {
        return fixvalue;
    }

    public void setFixvalue(float fixvalue) {
        this.fixvalue = fixvalue;
    }

    public float getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(float minvalue) {
        this.minvalue = minvalue;
    }

    public float getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(float maxvalue) {
        this.maxvalue = maxvalue;
    }

    public ApertureMode getAperturemode() {
        return aperturemode;
    }

    public void setAperturemode(ApertureMode aperturemode) {
        this.aperturemode = aperturemode;
    }

    public float getAperturevalue() {
        return aperturevalue;
    }

    public void setAperturevalue(float aperturevalue) {
        this.aperturevalue = aperturevalue;
    }

    public float getMatrixformat() {
        return matrixformat;
    }

    public void setMatrixformat(float matrixformat) {
        this.matrixformat = matrixformat;
    }

    public MountingType getMountingtype() {
        return mountingtype;
    }

    public void setMountingtype(MountingType mountingtype) {
        this.mountingtype = mountingtype;
    }

    public Lens(TypeLens typelens, float matrixformat, MountingType mountingtype, ApertureMode aperturemode) {
        this.typelens = typelens;
        this.matrixformat = matrixformat;
        this.mountingtype = mountingtype;
        this.aperturemode = aperturemode;
    }

    public Lens(TypeLens typelens, float fixvalue, float minvalue, int maxvalue, ApertureMode aperturemode, float aperturevalue, float matrixformat, MountingType mountingtype) {
        this(typelens, matrixformat, mountingtype, aperturemode);
        this.fixvalue = fixvalue;
        this.minvalue = minvalue;
        this.maxvalue = maxvalue;
        this.aperturevalue = aperturevalue;
    }
}
