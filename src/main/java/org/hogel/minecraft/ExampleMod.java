package org.hogel.minecraft;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hogel.minecraft.item.ModPickaxeItem;
import org.hogel.minecraft.item.ModSwordItem;

@Mod("myfirstmod")
public class ExampleMod {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String MODID = "myfirstmod";

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<ModSwordItem> ITEM_MOD_SWORD;
    public static final RegistryObject<ModPickaxeItem> ITEM_MOD_PICKAXE;
    static {
        ITEM_MOD_SWORD = ITEMS.register("mod_sword", () -> new ModSwordItem());
        ITEM_MOD_PICKAXE = ITEMS.register("mod_pickaxe", () -> new ModPickaxeItem());
    }

    public ExampleMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup " + MODID);
    }
}
