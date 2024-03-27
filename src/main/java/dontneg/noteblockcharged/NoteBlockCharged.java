package dontneg.noteblockcharged;

import dontneg.noteblockcharged.block.NoteBlocks;
import dontneg.noteblockcharged.creativetab.NoteBlockCreativeClass;
import dontneg.noteblockcharged.sound.NoteSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoteBlockCharged implements ModInitializer {
	public static final String MOD_ID = "noteblockcharged";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Note Block Charged - Server Initializing!");
		NoteBlocks.registerBlocks();
		NoteBlockCreativeClass.registerCreativeTabs();
		NoteSounds.registerSounds();
	}
}