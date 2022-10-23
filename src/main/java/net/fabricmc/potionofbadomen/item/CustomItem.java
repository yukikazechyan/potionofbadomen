package net.fabricmc.potionofbadomen.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author Enaium
 */
public class CustomItem extends Item {
    public CustomItem(Settings settings) {
        super(settings);
    }



    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        //tooltip.add(Text.literal("123"));//此处为测试物品注释，但失败了
        //tooltip.add(Text.literal("321）"));
        tooltip.add(Text.translatable("item.potionofbadomen.fabric_item.tooltip", "Value"));
    }




}
