package Rewards.Gold;

import Classes.ItemGenerator;
import Classes.IGameItem;

public class GoldFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
    
}
