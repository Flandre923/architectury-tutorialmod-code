package net.tutorialmod.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.Item;
import net.tutorialmod.TutorialMod;
import net.tutorialmod.item.custom.EightBallItem;

public class ModItem {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(TutorialMod.MOD_ID, Registries.ITEM);
    // 皓石
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("zircon", () ->
            new Item(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)));
    // 高级物品
    public static final RegistrySupplier<Item> EIGHT_BALL_ITEM = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB).stacksTo(1)));

    public static void register(){
        ITEMS.register();
    }

}
