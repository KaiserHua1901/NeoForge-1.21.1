package net.kaiser.tutorialmod.item;

import net.kaiser.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);
    // Register a new item FROM the MODID to Items class. that will be inside MODID

    public static final DeferredItem<Item> EXAMPLEITEM = ITEMS.register("exampleitem",
            () -> new Item(new Item.Properties()));
    // I THINK This will add item into the game. but without asset or even in creative tab or anywhere.

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        // No clue what this does yet.
    }
}
