package Fabric.Rewards.Gem;

import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class GemFabric extends Fabric {
     @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
