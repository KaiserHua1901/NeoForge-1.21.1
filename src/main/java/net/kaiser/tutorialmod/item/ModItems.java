package net.kaiser.tutorialmod.item;

import net.kaiser.tutorialmod.TutorialMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
