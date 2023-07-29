package Fabric.Rewards.Gold;

import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
    
}
