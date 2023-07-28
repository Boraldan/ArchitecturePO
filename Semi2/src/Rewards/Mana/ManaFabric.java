package Rewards.Mana;

import Classes.ItemGenerator;
import Classes.IGameItem;

public class ManaFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Mana();
    }
}
