package net.fabricmc.potionofbadomen;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.effcts.loot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class potionofbadomen implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it 's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("potionofbadomen");





	public static final loot LOOT_EFFECT = new loot();//此处关于药水
	public static final Potion LOOT = new Potion(new StatusEffectInstance(potionofbadomen.LOOT_EFFECT, 2000));//此药水效果时间为100s，但此效果应是妾身新增的效果，可能并无用处


	@Override
	public void onInitialize() {
	//public void registerDefaulst() {

			// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("御机嫌よう，即将开始注册物品");





		Registry.register(Registry.STATUS_EFFECT, new Identifier("potionofbadomen", "loot"), LOOT_EFFECT);//此处为药水注册
		Registry.register(Registry.POTION, new Identifier("potionofbadomen", "loot"), LOOT);

	}






}

