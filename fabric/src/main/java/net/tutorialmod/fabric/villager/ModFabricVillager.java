package net.tutorialmod.fabric.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.tutorialmod.item.ModItem;
import net.tutorialmod.villager.ModVillagers;

public class ModFabricVillager {
    public static void registerVillagerTrades(){
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JUMP_MASTER.get(),1,
                factories->{
                    factories.add((entity, randomSource) -> new MerchantOffer(
                            new ItemStack(Items.EMERALD,3),
                            new ItemStack(ModItem.EXAMPLE_ITEM.get()),
                            6,2,0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER,1,
                factories->{
                    factories.add((entity, randomSource) -> new MerchantOffer(
                            new ItemStack(Items.EMERALD,3),
                            new ItemStack(ModItem.BLUEBERRY.get()),
                            6,2,0.02f
                    ));
                });


    }
}
