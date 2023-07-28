import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Rewards.Bronze.BronzeFabric;
import Rewards.Gem.GemFabric;
import Rewards.Gold.GoldFabric;
import Rewards.Iron.IronFabric;
import Rewards.Mana.ManaFabric;
import Rewards.Silver.SilverFabric;
import Rewards.Stone.StoneFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fabGold = new GoldFabric();
        fabGold.openReward();
        ItemGenerator fabGem = new GemFabric();
        fabGem.openReward();
        //System.out.println("Hello, World!");
        ItemGenerator fabBronze = new BronzeFabric();
        fabBronze.openReward();
        ItemGenerator fabIron = new IronFabric();
        fabIron.openReward();
        ItemGenerator fabMana = new ManaFabric();
        fabMana.openReward();
        ItemGenerator fabSilver = new SilverFabric();
        fabSilver.openReward();
        ItemGenerator fabStone = new StoneFabric();
        fabStone.openReward();


        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
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
