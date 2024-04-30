package net.davio.aquaticambitions.entry;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.common.Tags;

import static com.simibubi.create.AllTags.AllItemTags.CREATE_INGOTS;
import static com.simibubi.create.AllTags.forgeItemTag;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static com.simibubi.create.foundation.data.TagGen.tagBlockAndItem;
import static net.davio.aquaticambitions.CreateAquaticAmbitions.REGISTRATE;

public class CCABlocks {

    static {
        REGISTRATE.setCreativeTab(CCACreativeModeTab.CREATIVE_TAB);
    }

    public static final BlockEntry<Block> PRISMARINE_ALLOY_BLOCK = REGISTRATE.block("prismarine_alloy_block" ,Block::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p.mapColor(MapColor.GLOW_LICHEN).requiresCorrectToolForDrops())
            .transform(pickaxeOnly())
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .transform(tagBlockAndItem("storage_blocks/prismarine"))
            .build()
            .lang("Prismarine Alloy Block")
            .register();

    public static void register() {};
}
