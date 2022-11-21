package net.vdelta.sigil_utils;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.vdelta.sigil_utils.block.SigilUtils_Blocks;
import net.vdelta.sigil_utils.item.SigilUtils_Items;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SigilUtils.MODID)
public class SigilUtils {
    public static final String MODID = "sigil_utils";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SigilUtils() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SigilUtils_Items.register(modEventBus);
        SigilUtils_Blocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
