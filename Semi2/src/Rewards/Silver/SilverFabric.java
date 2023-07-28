package Rewards.Silver;

import Classes.ItemGenerator;
import Classes.IGameItem;

public class SilverFabric  extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
