package net.pengi.potatoperks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pengi.potatoperks.PotatoPerks;

public class ModItems {

    public static final Item PINK_POTATO = registerItem("pink_potato", new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PotatoPerks.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PotatoPerks.LOGGER.info("Registering Mod Items for " + PotatoPerks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        entries.add(PINK_POTATO);
        } );
    }
}