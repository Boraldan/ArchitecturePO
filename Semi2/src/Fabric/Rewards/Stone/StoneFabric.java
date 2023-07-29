package Fabric.Rewards.Stone;

import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class StoneFabric extends ItemGenerator  {
    @Override
    public IGameItem createItem() {
        return new Stone();
    }
}
