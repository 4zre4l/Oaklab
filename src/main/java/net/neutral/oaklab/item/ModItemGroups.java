package net.neutral.oaklab.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.neutral.oaklab.Oaklab;
import net.neutral.oaklab.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup OAKLAB_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Oaklab.MOD_ID, "oaklab_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OPAL))
                    .displayName(Text.translatable("itemgroup.oaklab.oaklab_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ONYX);
                        entries.add(ModItems.OPAL);
                    }).build());
    public static final ItemGroup OAKLAB_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Oaklab.MOD_ID, "oaklab_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.OPAL_BLOCK))
                    .displayName(Text.translatable("itemgroup.oaklab.oaklab_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ONYX_BLOCK);
                        entries.add(ModBlocks.ONYX_ORE);
                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.OPAL_ORE);
                    }).build());

    public static void registerItemGroups() {
        Oaklab.LOGGER.info("Registering Item Groups for " + Oaklab.MOD_ID);
    }
}
