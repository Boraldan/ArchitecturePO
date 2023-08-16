package Fabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.Rewards.Bronze.BronzeFabric;
import Fabric.Classes.Fabric;
import Fabric.Rewards.Gem.GemFabric;
import Fabric.Rewards.Gold.GoldFabric;
import Fabric.Rewards.Iron.IronFabric;
import Fabric.Rewards.Mana.ManaFabric;
import Fabric.Rewards.Silver.SilverFabric;
import Fabric.Rewards.Stone.StoneFabric;

public class App {
    public static void main(String[] args) throws Exception {
        Fabric fabGold = new GoldFabric();
        fabGold.openReward();
        Fabric fabGem = new GemFabric();
        fabGem.openReward();
        //System.out.println("Hello, World!");
        Fabric fabBronze = new BronzeFabric();
        fabBronze.openReward();
        Fabric fabIron = new IronFabric();
        fabIron.openReward();
        Fabric fabMana = new ManaFabric();
        fabMana.openReward();
        Fabric fabSilver = new SilverFabric();
        fabSilver.openReward();
        Fabric fabStone = new StoneFabric();
        fabStone.openReward();


        Random rnd = ThreadLocalRandom.current();
        List<Fabric> fabricList = new ArrayList<>();
        fabricList.add(fabGold);
        fabricList.add(fabGem);
        fabricList.add(fabBronze);
        fabricList.add(fabIron);
        fabricList.add(fabMana);
        fabricList.add(fabSilver);
        fabricList.add(fabStone);

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
