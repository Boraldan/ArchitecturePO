package Fabric.Rewards.Iron;

import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class IronFabric extends Fabric {
    @Override
    public IGameItem createItem() {
        return new Iron();
    }
}
