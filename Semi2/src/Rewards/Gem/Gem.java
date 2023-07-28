package Rewards.Gem;

import Classes.IGameItem;

public class Gem implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
