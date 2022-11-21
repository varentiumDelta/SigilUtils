package net.vdelta.sigil_utils.block;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vdelta.sigil_utils.SigilUtils;
import net.vdelta.sigil_utils.item.SigilUtils_CreativeModeTab;
import net.vdelta.sigil_utils.item.SigilUtils_Items;

import java.util.function.Supplier;

public class SigilUtils_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SigilUtils.MODID);

    // progression
    public static final RegistryObject<Block> VARENTIUM_BLOCK = registerBlock("varentium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> VARENTIUM_ORE = registerBlock("varentium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(7,14)), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> DEEPSLATE_VARENTIUM_ORE = registerBlock("deepslate_varentium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops(), UniformInt.of(7,14)), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> CIRCADIUM_BLOCK = registerBlock("circadium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> ORICHALCOM_BLOCK = registerBlock("orichalcom_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);

    // reglazed terracotta
    public static final RegistryObject<Block> BLACK_REGLAZED_TERRACOTTA = registerBlock("black_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> BLUE_REGLAZED_TERRACOTTA = registerBlock("blue_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> BROWN_REGLAZED_TERRACOTTA = registerBlock("brown_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> CYAN_REGLAZED_TERRACOTTA = registerBlock("cyan_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> GRAY_REGLAZED_TERRACOTTA = registerBlock("gray_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> GREEN_REGLAZED_TERRACOTTA = registerBlock("green_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> MAGENTA_REGLAZED_TERRACOTTA = registerBlock("magenta_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_REGLAZED_TERRACOTTA = registerBlock("light_blue_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_REGLAZED_TERRACOTTA = registerBlock("light_gray_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> LIME_REGLAZED_TERRACOTTA = registerBlock("lime_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> ORANGE_REGLAZED_TERRACOTTA = registerBlock("orange_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> PINK_REGLAZED_TERRACOTTA = registerBlock("pink_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> PURPLE_REGLAZED_TERRACOTTA = registerBlock("purple_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> RED_REGLAZED_TERRACOTTA = registerBlock("red_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> WHITE_REGLAZED_TERRACOTTA = registerBlock("white_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);
    public static final RegistryObject<Block> YELLOW_REGLAZED_TERRACOTTA = registerBlock("yellow_reglazed_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), SigilUtils_CreativeModeTab.SIGIL_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return SigilUtils_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
