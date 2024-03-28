package dontneg.noteblockcharged;

import net.fabricmc.api.ClientModInitializer;

public class NoteBlockChargedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        NoteBlockCharged.LOGGER.info("Note Block Charged - Client Initializing!");    }
}
