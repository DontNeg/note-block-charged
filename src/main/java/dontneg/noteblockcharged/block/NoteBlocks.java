package dontneg.noteblockcharged.block;

import dontneg.noteblockcharged.NoteBlockCharged;
import dontneg.noteblockcharged.block.cnoteblock.ChargedNoteBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class NoteBlocks {
    public static final Block CHARGED_NOTE_BLOCK = registerBlock("charged_note_block",
            new ChargedNoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK)
                    .luminance(state -> state.get(ChargedNoteBlock.CHARGED) ? 7 : 0)));


    @SuppressWarnings("SameParameterValue")
    private static Block registerBlock(String key, Block block){
        registerBlockItem(key, block);
        return Registry.register(Registries.BLOCK, new Identifier(NoteBlockCharged.MOD_ID, key), block);
    }

    private static void registerBlockItem(String key, Block block){
        Registry.register(Registries.ITEM, new Identifier(NoteBlockCharged.MOD_ID, key),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks(){
        NoteBlockCharged.LOGGER.info("Note Block Charged - Block Initializing!");
    }
}
