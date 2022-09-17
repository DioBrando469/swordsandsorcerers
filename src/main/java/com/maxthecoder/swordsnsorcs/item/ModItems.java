package com.maxthecoder.swordsnsorcs.item;

import com.google.common.eventbus.EventBus;
import com.maxthecoder.swordsnsorcs.SwordsAndSorcerers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
    {
        public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, SwordsAndSorcerers.MOD_ID);

        public static final RegistryObject<Item> Pelmen = Items.register("rawpelmen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Buffs).stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(1).effect(() -> new MobEffectInstance(MobEffects.POISON, 300, 1), 0.5f).build())));
        public static final RegistryObject<Item> BucketOfPelmen = Items.register("bucketofpelmen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Buffs).stacksTo(1)));
        public static final RegistryObject<Item> CookedPelmeni = Items.register("cookedpelmeni", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Buffs).stacksTo(1)));
        public static final RegistryObject<Item> Pelmeni = Items.register("pelmeni", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Buffs).stacksTo(1).food(new FoodProperties.Builder().nutrition(10).saturationMod(5).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 1), 1f).build())));
        public static void register(IEventBus eventBus)
        {
            Items.register(eventBus);
        }
    }
