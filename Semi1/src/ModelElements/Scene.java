package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }


}