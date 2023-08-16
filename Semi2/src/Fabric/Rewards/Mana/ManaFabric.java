package Fabric.Rewards.Mana;

import Fabric.Classes.Fabric;
import Fabric.Classes.IGameItem;

public class ManaFabric extends Fabric {
    @Override
    public IGameItem createItem() {
        return new Mana();
    }
}
