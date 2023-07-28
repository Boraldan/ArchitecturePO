package Rewards.Iron;

import Classes.ItemGenerator;
import Classes.IGameItem;

public class IronFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Iron();
    }
}
