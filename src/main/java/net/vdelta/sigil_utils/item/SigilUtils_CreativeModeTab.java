package net.vdelta.sigil_utils.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SigilUtils_CreativeModeTab {
    public static final CreativeModeTab SIGIL_TAB = new CreativeModeTab("sigil_utils") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SigilUtils_Items.RING_OF_TRANSMUTATION.get());
        }
    };
}
