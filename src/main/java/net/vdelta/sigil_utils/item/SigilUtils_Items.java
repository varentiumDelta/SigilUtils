package net.vdelta.sigil_utils.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vdelta.sigil_utils.SigilUtils;

public class SigilUtils_Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SigilUtils.MODID);

    // progression
    public static final RegistryObject<Item> VARENTIUM = ITEMS.register("varentium", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> CIRCADIUM_INGOT = ITEMS.register("circadium_ingot", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> CIRCADIUM_POWDER = ITEMS.register("circadium_powder", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> ORICHALCOM_INGOT = ITEMS.register("orichalcom_ingot", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> ORICHALCOM_NUGGET = ITEMS.register("orichalcom_nugget", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> RING_OF_TRANSMUTATION = ITEMS.register("ring_of_transmutation", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> RING_OF_HOLDING = ITEMS.register("ring_of_holding", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> ORICHALCOM_EGG = ITEMS.register("orichalcom_egg", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> ASTRAL_STAR = ITEMS.register("astral_star", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));

    // upgrade cores
    public static final RegistryObject<Item> STONE_UPGRADE_CORE = ITEMS.register("stone_upgrade_core", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> CHAIN_UPGRADE_CORE = ITEMS.register("chain_upgrade_core", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> IRON_UPGRADE_CORE = ITEMS.register("iron_upgrade_core", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> GOLD_UPGRADE_CORE = ITEMS.register("gold_upgrade_core", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> DIAMOND_UPGRADE_CORE = ITEMS.register("diamond_upgrade_core", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));

    // fuels
    public static final RegistryObject<Item> COAL_CHUNK = ITEMS.register("coal_chunk", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));
    public static final RegistryObject<Item> CHARCOAL_CHUNK = ITEMS.register("charcoal_chunk", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));

    // foods
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(4f).build())));
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())));
    public static final RegistryObject<Item> PERFECT_PEACH = ITEMS.register("perfect_peach", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB).food(new FoodProperties.Builder().nutrition(16).saturationMod(20f).build())));
    public static final RegistryObject<Item> MOSS_BALL = ITEMS.register("moss_ball", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(8f).build())));

    // misc
    public static final RegistryObject<Item> MUSIC_DISC_RUDEBUSTER = ITEMS.register("music_disc_rudebuster", () -> new Item(new Item.Properties().tab(SigilUtils_CreativeModeTab.SIGIL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
