package Fabric.Rewards.Silver;

import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class SilverFabric  extends Fabric {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
