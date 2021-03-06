package io.github.vampirestudios.raa_materials.registries;

import io.github.vampirestudios.raa_materials.RAAMaterials;
import io.github.vampirestudios.raa_materials.api.enums.TextureTypes;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class Textures {

    public static void init() {
        itemTextures();
        blockTextures();
    }

    private static void itemTextures() {
        for (int i = 1; i < 19; i++) {
            addTextureToList(TextureTypes.INGOT_TEXTURES, "item/ingots/ingot_" + i);
        }
        for (int i = 1; i < 24; i++) {
            addTextureToList(TextureTypes.GEM_ITEM_TEXTURES, "item/gems/gem_" + i);
        }
        for (int i = 1; i < 11; i++) {
            addTextureToList(TextureTypes.CRYSTAL_ITEM_TEXTURES, "item/crystals/crystal_" + i);
        }
        for (int i = 1; i < 9; i++) {
            addTextureToList(TextureTypes.METAL_NUGGET_TEXTURES, "item/nuggets/nugget_" + i);
        }

        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.HELMET_TEXTURES, "item/armor/helmet_" + i);
        }
        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.CHESTPLATE_TEXTURES, "item/armor/chestplate_" + i);
        }
        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.LEGGINGS_TEXTURES, "item/armor/leggings_" + i);
        }
        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.BOOTS_TEXTURES, "item/armor/boots_" + i);
        }

        for (int i = 1; i < 12; i++) {
            addTextureToList(TextureTypes.FRUIT_TEXTURES, "item/fruits/fruit_" + i);
        }

        addTextureToList(TextureTypes.HORSE_ARMOR_SADDLE_TEXTURES, "item/armor/horse_armor_saddle");
        addTextureToList(TextureTypes.HORSE_ARMOR_SADDLE_TEXTURES, "item/armor/horse_armor_saddle_2");

        TextureTypes.HORSE_ARMOR_MODEL_TEXTURES.add(new Identifier(RAAMaterials.MOD_ID, "textures/models/armor/horse/horse_armor_1.png"));
        TextureTypes.HORSE_ARMOR_MODEL_TEXTURES.add(new Identifier(RAAMaterials.MOD_ID, "textures/models/armor/horse/horse_armor_2.png"));

        addTexturesToMap(TextureTypes.HORSE_ARMOR, "item/armor/horse_armor_saddle",
                "textures/models/armor/horse/horse_armor_1.png");
        addTexturesToMap(TextureTypes.HORSE_ARMOR, "item/armor/horse_armor_saddle_2",
                "textures/models/armor/horse/horse_armor_2.png");

        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_1", "item/tools/hoe/hoe_stick_1");
        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_2", "item/tools/hoe/hoe_stick_2");
        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_3", "item/tools/hoe/hoe_stick_3");

        //Sword Stuff
        for (int i = 1; i < 14; i++) {
            addTextureToList(TextureTypes.SWORD_BLADES, "item/tools/sword/blade_" + i);
        }
        for (int i = 1; i < 12; i++) {
            addTextureToList(TextureTypes.SWORD_HANDLES, "item/tools/sword/handle_" + i);
        }

        //Pickaxe Stuff
        for (int i = 1; i < 10; i++) {
            addTextureToList(TextureTypes.PICKAXE_HEAD, "item/tools/pickaxe/pickaxe_" + i);
        }
        for (int i = 1; i < 10; i++) {
            addTextureToList(TextureTypes.PICKAXE_STICKS, "item/tools/pickaxe/stick_" + i);
        }

        //Axe Stuff
        for (int i = 1; i < 12; i++) {
            addTextureToList(TextureTypes.AXE_HEAD, "item/tools/axe/axe_head_" + i);
        }
        for (int i = 1; i < 9; i++) {
            addTextureToList(TextureTypes.AXE_STICKS, "item/tools/axe/axe_stick_" + i);
        }

        //Hoe Stuff
        for (int i = 1; i < 11; i++) {
            addTextureToList(TextureTypes.HOE_HEAD, "item/tools/hoe/hoe_head_" + i);
        }
        for (int i = 1; i < 11; i++) {
            addTextureToList(TextureTypes.HOE_STICKS, "item/tools/hoe/hoe_stick_" + i);
        }

        //Shovel Stuff
        for (int i = 1; i < 12; i++) {
            addTextureToList(TextureTypes.SHOVEL_HEAD, "item/tools/shovel/shovel_head_" + i);
        }
        for (int i = 1; i < 12; i++) {
            addTextureToList(TextureTypes.SHOVEL_STICKS, "item/tools/shovel/shovel_stick_" + i);
        }

        addTextureToList(TextureTypes.METAL_GEAR_TEXTURES, "item/gears/gear_1");

        addTextureToList(TextureTypes.METAL_PLATE_TEXTURES, "item/plates/plate_1");
        addTextureToList(TextureTypes.METAL_PLATE_TEXTURES, "item/plates/plate_2");

        addTextureToList(TextureTypes.SMALL_DUST_TEXTURES, "item/small_dusts/small_dust_1");

        addTextureToList(TextureTypes.DUST_TEXTURES, "item/dusts/dust_1");
        addTextureToList(TextureTypes.DUST_TEXTURES, "item/dusts/dust_2");
    }

    private static void blockTextures() {
        for (int i = 1; i < 10; i++) {
            addTextureToList(TextureTypes.METAL_ORE_TEXTURES, "block/ores/metals/ore_" + i);
        }
        for (int i = 1; i < 9; i++) {
            addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/gems/ore_" + i);
        }
        for (int i = 1; i < 11; i++) {
            addTextureToList(TextureTypes.CRYSTAL_ORE_TEXTURES, "block/ores/crystals/ore_" + i);
        }
        for (int i = 1; i < 4; i++) {
            addTextureToList(TextureTypes.METAL_ORE_TEXTURES, "block/ores/generic_ore_" + i);
            addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/generic_ore_" + i);
            addTextureToList(TextureTypes.CRYSTAL_ORE_TEXTURES, "block/ores/generic_ore_" + i);
        }


        for (int i = 1; i < 7; i++) {
            addTextureToList(TextureTypes.METAL_BLOCK_TEXTURES, "block/storage_blocks/metals/metal_" + i);
        }
        for (int i = 1; i < 6; i++) {
            addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/gems/gem_" + i);
        }
        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.CRYSTAL_BLOCK_TEXTURES, "block/storage_blocks/crystals/crystal_" + i);
        }

    }

    private static void addTextureToList(List<Identifier> textures, String name) {
        addTextureToList(textures, new Identifier(RAAMaterials.MOD_ID, name));
    }

    private static void addTextureToList(List<Identifier> textures, Identifier name) {
        textures.add(name);
    }

    private static void addTexturesToMap(Map<Identifier, Identifier> textureSets, String texture1, String texture2) {
        textureSets.put(
                new Identifier(RAAMaterials.MOD_ID, texture1),
                new Identifier(RAAMaterials.MOD_ID, texture2)
        );
    }

}
