package net.tutorialmod.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.tutorialmod.TutorialMod;
import net.tutorialmod.block.ModBlock;
import net.tutorialmod.item.custom.EightBallItem;

public class ModItem {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(TutorialMod.MOD_ID, Registries.ITEM);
    // 皓石
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("zircon", () ->
            new Item(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)));
    // 高级物品
    public static final RegistrySupplier<Item> EIGHT_BALL_ITEM = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB).stacksTo(1)));
    //
    public static final RegistrySupplier<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)));
    //
    public static final RegistrySupplier<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlock.BLUEBERRY_CROP.get(),
                    new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)));

    public static final RegistrySupplier<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static void register(){
        ITEMS.register();
    }

}
