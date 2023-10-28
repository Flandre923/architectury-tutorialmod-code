package net.tutorialmod.forge;

import net.tutorialmod.TutorialModExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class TutorialModExpectPlatformImpl {
    /**
     * This is our actual method to {@link TutorialModExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
