package net.tutorialmod.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.tutorialmod.block.ModBlock;

public class TutorialModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.BLUEBERRY_CROP.get(), RenderType.cutout());
    }
}
