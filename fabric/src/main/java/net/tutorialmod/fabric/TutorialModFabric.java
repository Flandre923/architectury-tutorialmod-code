package net.tutorialmod.fabric;

import net.tutorialmod.TutorialMod;
import net.fabricmc.api.ModInitializer;

public class TutorialModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TutorialMod.init();
    }
}
