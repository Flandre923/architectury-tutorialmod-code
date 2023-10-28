package net.tutorialmod;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.tutorialmod.block.ModBlock;
import net.tutorialmod.item.ModCreativeTab;
import net.tutorialmod.item.ModItem;

import java.util.function.Supplier;

public class TutorialMod {
    public static final String MOD_ID = "tutorialmod";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    public static void init() {
        ModCreativeTab.register();
        ModBlock.register();
        ModItem.register();

        System.out.println(TutorialModExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
