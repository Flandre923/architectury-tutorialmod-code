package net.tutorialmod.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.tutorialmod.TutorialMod;

public class ModItem {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(TutorialMod.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("zircon", () ->
            new Item(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)));


    public static void register(){
        ITEMS.register();
    }

}
