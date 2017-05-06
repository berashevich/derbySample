import java.util.Collection;

public class DerbyDemo {

    public static void main(String[] args) {
        DbHelper dh = new DbHelper();
        dh.createTables(DbHelper.getDbConnection());

        LensHelper lh = new LensHelper();
        lh.createTables(LensHelper.getDbConnection());

        Camera camera = new Camera(
                2,2, Camera.Typebody.KUPOL, Camera.SignalRatio.GOOD, 2,2,2,"VOL", Camera.ShootingMode.BW, Camera.AlarmInOut.NONE, Camera.CompressionImage.MOTION_JPEG);
        DbHelper.addCamera(camera);

        Camera camera1 = new Camera(
                1.5,1, Camera.Typebody.CILINDR, Camera.SignalRatio.EXCELLENT, 1.5,1.2,1.7,"15VOL", Camera.ShootingMode.BW_AND_COLOR, Camera.AlarmInOut.CUSTOM_TWO_TWO, Camera.CompressionImage.H264,25,25, Camera.DayNightMode.YES, Camera.IRled.NO, Camera.SupportAudio.TWO_WAY_AUDIO);
        DbHelper.addCameraExtra(camera1);

        Lens lens = new Lens(
                Lens.TypeLens.Fix, 1.5, Lens.ZoomMode.Max, 1,1, Lens.ApertureMode.Automatic,1.5,1.5, Lens.MountingType.C);
        LensHelper.addLens(lens);

        //DbHelper.addPerson(new Person("First", "Lastovich"));

//        Collection<Person> persons = DbHelper.getPersons();
//        persons.stream().forEach(person -> {
//            System.out.println(person.getfName() + " " + person.getlName());
//        });
    }
}