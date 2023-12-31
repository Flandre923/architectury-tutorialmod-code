package net.tutorialmod.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.tutorialmod.TutorialMod;
import net.tutorialmod.block.custom.BlueberryCropBlock;
import net.tutorialmod.block.custom.JumpyBlock;
import net.tutorialmod.block.custom.ZirconLampBlock;
import net.tutorialmod.item.ModCreativeTab;
import net.tutorialmod.item.ModItem;

import java.util.function.Supplier;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(TutorialMod.MOD_ID, Registries.BLOCK);

//    public static final RegistrySupplier<Block> ZIRCON_BLOCK = BLOCKS.register("zircon_block",()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> ZIRCON_BLOCK = registerBlock("zircon_block",()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> JUMPY_BLOCK = registerBlock("jumpy_block",()-> new JumpyBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //ore
    public static final RegistrySupplier<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)));
    public static final RegistrySupplier<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)));
    public static final RegistrySupplier<Block> ENDSTONE_ZIRCON_ORE = registerBlock("endstone_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)));
    public static final RegistrySupplier<Block> NETHERRACK_ZIRCON_ORE = registerBlock("netherrack_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)));
    //lamp
    public static final RegistrySupplier<Block> ZIRCON_LAMP = registerBlock("zircon_lamp",
            () -> new ZirconLampBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(ZirconLampBlock.LIT) ? 15 : 0)));
    //crop
    public static final RegistrySupplier<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
            () -> new BlueberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    private static <T extends Block> RegistrySupplier<T> registerBlock(String name, Supplier<T> block) {
        RegistrySupplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> RegistrySupplier<Item> registerBlockItem(String name, RegistrySupplier<T> block) {
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().arch$tab(ModCreativeTab.EXAMPLE_TAB)));
    }


    public static void register(){
        BLOCKS.register();
    }



}
