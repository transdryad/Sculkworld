package com.transdryad.sculkworld.item;

import com.transdryad.sculkworld.SculkWorld;
import com.transdryad.sculkworld.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SCULK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(SculkWorld.MOD_ID,
            "sculk"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sculk"))
                    .icon(() -> new ItemStack(ModItems.INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHARD);
                        entries.add(ModItems.INGOT);
                        entries.add(ModBlocks.SCULK_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        SculkWorld.LOGGER.info("Registering Item Groups for " + SculkWorld.MOD_ID);
    }
}
