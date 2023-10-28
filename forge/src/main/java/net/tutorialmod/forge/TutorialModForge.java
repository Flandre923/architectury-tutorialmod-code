package net.tutorialmod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.tutorialmod.TutorialMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TutorialMod.MOD_ID)
public class TutorialModForge {
    public TutorialModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TutorialMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TutorialMod.init();
    }
}
