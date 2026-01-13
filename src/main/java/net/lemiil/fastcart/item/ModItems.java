package net.lemiil.fastcart.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lemiil.fastcart.FastCart;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MinecartItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FAST_CART = registerItem("fast_cart", new MinecartItem(AbstractMinecartEntity.Type.RIDEABLE, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FastCart.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FastCart.LOGGER.info("Registering mod items " + FastCart.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(FAST_CART);
        });
    }
}
