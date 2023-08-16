package Fabric.Rewards.Bronze;
import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class BronzeFabric extends Fabric {
    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
