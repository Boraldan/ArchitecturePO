package Fabric.Rewards.Bronze;
import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class BronzeFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
