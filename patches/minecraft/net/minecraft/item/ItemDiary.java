package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemDiary extends ItemBook {

    public ItemDiary() {
        this.setUnlocalizedName("diary");
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.displayGUIBook(stack);
        return stack;
    }
}
