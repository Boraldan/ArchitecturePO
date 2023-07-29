package Fabric.Rewards.Silver;

import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class SilverFabric  extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
