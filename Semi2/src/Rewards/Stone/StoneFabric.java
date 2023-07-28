package Rewards.Stone;

import Classes.ItemGenerator;
import Classes.IGameItem;

public class StoneFabric extends ItemGenerator  {
    @Override
    public IGameItem createItem() {
        return new Stone();
    }
}
