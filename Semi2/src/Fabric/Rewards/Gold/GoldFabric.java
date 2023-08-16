package Fabric.Rewards.Gold;

import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class GoldFabric extends Fabric {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
    
}
