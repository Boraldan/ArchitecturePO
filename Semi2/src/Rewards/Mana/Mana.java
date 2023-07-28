package Rewards.Mana;

import Classes.IGameItem;

public class Mana implements IGameItem {

    @Override
    public void open() {
        System.out.println("Mana!");
    }
}