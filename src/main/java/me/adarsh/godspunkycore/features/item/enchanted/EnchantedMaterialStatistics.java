package me.adarsh.godspunkycore.features.item.enchanted;

import me.adarsh.godspunkycore.features.item.MaterialQuantifiable;
import me.adarsh.godspunkycore.features.item.MaterialStatistics;
import me.adarsh.godspunkycore.features.item.SMaterial;
import me.adarsh.godspunkycore.features.item.ShapelessRecipe;


public interface EnchantedMaterialStatistics extends MaterialStatistics {
    SMaterial getCraftingMaterial();

    MaterialQuantifiable getResult();

    default SMaterial getBlockCraftingMaterial() {
        return null;
    }

    default MaterialQuantifiable getBlockResult() {
        return null;
    }

    default int getCraftingRequiredAmount() {
        return 32;
    }

    @Override
    default void load() {
        if (getBlockCraftingMaterial() != null && getBlockResult() != null)
            createRecipe(new MaterialQuantifiable(getBlockCraftingMaterial(), getCraftingRequiredAmount()), getBlockResult());
        createRecipe(new MaterialQuantifiable(getCraftingMaterial(), getCraftingRequiredAmount()), getResult());
    }

    static void createRecipe(MaterialQuantifiable material, MaterialQuantifiable result) {
        new ShapelessRecipe(result.getMaterial(), result.getAmount())
                .add(material)
                .add(material)
                .add(material)
                .add(material)
                .add(material);
    }
}