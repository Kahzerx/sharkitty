package com.kahzerx;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class Sharkitty implements ModInitializer {
	@Override
	public void onInitialize() {
		SharkittyItem item = new SharkittyItem(new Item.Settings().rarity(Rarity.EPIC).maxCount(1));
		Registry.register(Registries.ITEM, new Identifier("sharkitty", "sharkitty"), item);
	}
}