package db;

import entities.Camera;
import entities.Lens;

public interface IVideoSystemDbHelper {
    void addCamera(Camera camera);
    void addLens(Lens lens);
}
