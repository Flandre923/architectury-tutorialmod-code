package net.tutorialmod.painting;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.level.block.Block;
import net.tutorialmod.TutorialMod;

public class ModPainting {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(TutorialMod.MOD_ID, Registries.PAINTING_VARIANT);
    public static final RegistrySupplier<PaintingVariant> PLANT = PAINTING_VARIANTS.register("plant",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> WANDERER = PAINTING_VARIANTS.register("wanderer",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> SUNSET = PAINTING_VARIANTS.register("sunset",
            () -> new PaintingVariant(32, 16));

    public static void register(){
        PAINTING_VARIANTS.register();
    }

}
