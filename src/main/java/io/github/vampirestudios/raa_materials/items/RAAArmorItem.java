package io.github.vampirestudios.raa_materials.items;

import io.github.vampirestudios.raa_core.api.name_generation.GeneratedItemName;
import io.github.vampirestudios.raa_materials.generation.materials.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.apache.commons.lang3.text.WordUtils;

public class RAAArmorItem extends DyeableArmorItem implements GeneratedItemName {

    private Material material;
    private EquipmentSlot equipmentSlot_1;

    public RAAArmorItem(Material material, EquipmentSlot equipmentSlot_1, Settings item$Settings_1) {
        super(material.getArmorMaterial(), equipmentSlot_1, item$Settings_1);
        this.material = material;
        this.equipmentSlot_1 = equipmentSlot_1;
    }

    @Override
    public int getColor(ItemStack stack) {
        return ((RAAArmorItem) stack.getItem()).material.getColor();
    }

    @Override
    public Text getName(ItemStack itemStack_1) {
        Object[] data = {WordUtils.capitalize(material.getName()),
                WordUtils.uncapitalize(material.getName()), WordUtils.uncapitalize(material.getName()).charAt(0), WordUtils.uncapitalize(material.getName()).charAt(material.getName().length() - 1)};
        return this.generateName("text.raa_materials.item.armor_" + this.equipmentSlot_1.getName(), data);
    }

}
