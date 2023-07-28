package Rewards.Gem;

import Classes.ItemGenerator;
import Classes.IGameItem;

public class GemFabric extends ItemGenerator  {
     @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
