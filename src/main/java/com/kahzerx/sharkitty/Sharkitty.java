package com.kahzerx.sharkitty;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sharkitty implements ModInitializer {
    private final Logger LOGGER = LogManager.getLogger();

//    public static final Item SHARKITTY = new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1));

    @Override
    public void onInitialize() {
//        Item SHARKITTY = new SharkittyItem(new Item.Settings().rarity(Rarity.EPIC).maxCount(1));
    }


//    @Override
//    public void onInitialize() {
//        Item SHARKITTY = new SharkittyItem(new Item.Settings().rarity(Rarity.EPIC).maxCount(1));
////        Registry.register(Registries.ITEM, new Identifier("sharkitty", "sharkitty"), SHARKITTY);
//    }
}
