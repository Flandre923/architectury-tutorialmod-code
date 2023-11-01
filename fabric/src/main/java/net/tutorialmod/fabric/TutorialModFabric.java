package net.tutorialmod.fabric;

import net.tutorialmod.TutorialMod;
import net.fabricmc.api.ModInitializer;
import net.tutorialmod.fabric.villager.ModFabricVillager;
import net.tutorialmod.villager.ModVillagers;

public class TutorialModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TutorialMod.init();
        ModFabricVillager.registerVillagerTrades();
    }
}
