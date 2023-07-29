package Fabric.Rewards.Gem;

import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class GemFabric extends ItemGenerator  {
     @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
