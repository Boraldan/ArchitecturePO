package Fabric.Rewards.Iron;

import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class IronFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Iron();
    }
}
