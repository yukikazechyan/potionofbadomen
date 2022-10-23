package net.fabricmc.potionofbadomen.mixin;

import net.fabricmc.potionofbadomen.potionofbadomen;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingMixin {
    @Invoker("registerPotionRecipe")
    public static void registerPotionRecipe(Potion input, Item item, Potion output){

    }


    //@Inject(at = @At("HEAD"), method = "onInitialize")
   @Inject(method = "registerDefaults", at = @At("HEAD"))//注入到这个方法的开头，但这个方法我创建了啊喵？
    private static  void registerDefaults(CallbackInfo ci){//自定义酿造
       // BrewingMixin.registerPotionRecipe(Potions.AWKWARD, shropshire.ABC,Potions.STRONG_HEALING);//粗制药水加上ABC这个物品酿造STR什么这个
        BrewingMixin.registerPotionRecipe(Potions.AWKWARD, Items.WHITE_BANNER, potionofbadomen.LOOT);
        //BrewingMixin.registerPotionRecipe(Potions.AWKWARD, Items.BLACK_BANNER, shropshire.LOOT);

        // BrewingMixin.onInitialize(Potions.AWKWARD, ominous_banner,Potions.STRONG_HEALING);

    }

}
