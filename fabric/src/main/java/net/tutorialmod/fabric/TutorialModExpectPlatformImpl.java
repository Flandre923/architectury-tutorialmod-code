package net.tutorialmod.fabric;

import net.tutorialmod.TutorialModExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class TutorialModExpectPlatformImpl {
    /**
     * This is our actual method to {@link TutorialModExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
