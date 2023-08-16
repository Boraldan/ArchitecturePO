package Fabric.Rewards.Stone;

import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class StoneFabric extends Fabric {
    @Override
    public IGameItem createItem() {
        return new Stone();
    }
}
