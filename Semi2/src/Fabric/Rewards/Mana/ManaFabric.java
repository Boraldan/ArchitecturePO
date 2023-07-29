package Fabric.Rewards.Mana;

import Fabric.Classes.ItemGenerator;
import Fabric.Classes.IGameItem;

public class ManaFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Mana();
    }
}
