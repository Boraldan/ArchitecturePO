package Fabric.Classes;

public abstract class Fabric {
    public abstract IGameItem createItem();
    public void openReward() {
        IGameItem gameItem = createItem();
        gameItem.open();
    }

}
