package net.neutral.oaklab.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.neutral.oaklab.Oaklab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OPAL = registerItem("opal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Oaklab.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Oaklab.LOGGER.info("Registering Mod Items for " + Oaklab.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OPAL);
        });
    }
}
