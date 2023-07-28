package Rewards.Bronze;
import Classes.ItemGenerator;
import Classes.IGameItem;

public class BronzeFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
