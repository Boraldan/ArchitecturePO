package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changeObservers;

    /**
     * конструктор
     *
     * @param texture
     * @throws Exception
     */
    public ModelStore(List<IModelChangedObserver> changedObservers) throws Exception {
        this.changeObservers = changedObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0,models,flashes, cameras));
    }


    /**
     * Возвращает scena по ID
     *
     * @param ID
     * @return
     */
    public Scene getScena(int ID) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).ID == ID) {
                return scenes.get(i);
            }

        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
     */
    @Override
    public void notifyChange(IModelChanger sender) {

    }
}