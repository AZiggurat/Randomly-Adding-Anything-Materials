package io.github.vampirestudios.raa_materials.client.textures;

import com.swordglowsblue.artifice.api.ArtificeResourcePack;
import io.github.vampirestudios.raa_materials.generation.materials.Material;
import io.github.vampirestudios.raa_materials.items.RAABlockItem;
import io.github.vampirestudios.vampirelib.utils.Utils;
import net.minecraft.util.Identifier;

public class MaterialBlockTextureProvider extends RAAMaterialTextureProvider {
    @Override
    public Identifier getId() {
        return TextureProviders.MATERIAL_BLOCK;
    }

    @Override
    public <T> void generateJSONs(T t, ArtificeResourcePack.ClientResourcePackBuilder clientResourcePackBuilder) {
        Material material = (Material) t;
        Identifier id = Utils.appendToPath(material.getId(), "_block");
        clientResourcePackBuilder.addBlockState(id, blockStateBuilder -> blockStateBuilder.variant("", variant -> {
            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
        }));
        clientResourcePackBuilder.addBlockModel(id, modelBuilder -> {
            modelBuilder.parent(new Identifier("block/leaves"));
            modelBuilder.texture("all", material.getTexturesInformation().getStorageBlockTexture());
        });
        clientResourcePackBuilder.addItemModel(id, modelBuilder ->
                modelBuilder.parent(new Identifier(id.getNamespace(), "block/" + id.getPath())));
    }
}