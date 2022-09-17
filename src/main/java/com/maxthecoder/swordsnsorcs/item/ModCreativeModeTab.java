package com.maxthecoder.swordsnsorcs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
    {
        public static final CreativeModeTab Buffs = new CreativeModeTab("buffstab")
        {
            @Override
            public ItemStack makeIcon()
            {
                return new ItemStack(ModItems.Pelmen.get());
            }
        };

    }
