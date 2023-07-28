package Rewards.Iron;

import Classes.IGameItem;

public class Iron implements IGameItem {
    @Override
    public void open() {
        System.out.println("Iron!");
    }
}
