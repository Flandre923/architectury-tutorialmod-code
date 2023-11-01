package net.tutorialmod.villager;

import com.google.common.collect.ImmutableSet;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.tutorialmod.TutorialMod;
import net.tutorialmod.block.ModBlock;

public class ModVillagers {
    public static final ResourceKey<PoiType> JUMPY_MASTER_KEY = createKey("jumpy_block_poi");

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(TutorialMod.MOD_ID, Registries.VILLAGER_PROFESSION);
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(TutorialMod.MOD_ID, Registries.POINT_OF_INTEREST_TYPE);


    public static final RegistrySupplier<PoiType> JUMPY_BLOCK_POI = POI_TYPES.register("jumpy_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlock.JUMPY_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistrySupplier<VillagerProfession> JUMP_MASTER = VILLAGER_PROFESSIONS.register("jumpy_master",
            () -> new VillagerProfession("jumpy_master", x -> x.value() == JUMPY_BLOCK_POI.get(),
                    x -> x.value() == JUMPY_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    private static ResourceKey<PoiType> createKey(String pName) {
        return ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, new ResourceLocation(TutorialMod.MOD_ID,pName));
    }


    public static void register() {
        POI_TYPES.register();
        VILLAGER_PROFESSIONS.register();
    }

    


}
