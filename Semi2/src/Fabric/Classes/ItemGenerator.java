package Fabric.Classes;

public abstract class ItemGenerator {
    public abstract IGameItem createItem();
    public void openReward() {
        IGameItem gameItem = createItem();
        gameItem.open();
    }

}
