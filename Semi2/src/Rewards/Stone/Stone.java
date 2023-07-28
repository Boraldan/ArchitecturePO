package Rewards.Stone;

import Classes.IGameItem;

public class Stone implements IGameItem {
    @Override
    public void open() {
        System.out.println("Stone!");
    }
}
