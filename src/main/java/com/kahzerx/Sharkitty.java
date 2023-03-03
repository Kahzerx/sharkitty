package com.kahzerx;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sharkitty implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("sharkitty");

	@Override
	public void onInitialize() {
		SharkittyItem item = new SharkittyItem(new Item.Settings().rarity(Rarity.EPIC).maxCount(1));
		Registry.register(Registries.ITEM, new Identifier("sharkitty", "sharkitty"), item);
	}
}