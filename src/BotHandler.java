import micro_handler.FletchingHandler;
import node_structure.branch_nodes.ContainsItems;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "Dungeonqueer", version = 1, name = "DFletcher", category = Category.FLETCHING)
public class BotHandler extends AbstractScript{
    private FletchingHandler fletchingHandler;
    /**
     * The initialization of objects is done here
     */
    @Override
    public void onStart() {
        fletchingHandler = new FletchingHandler(new ContainsItems(this));
        super.onStart();
    }

    /**
     * Runs the handler, following its logic
     * @return
     */
    @Override
    public int onLoop() {
        fletchingHandler.verify();
        return 0;
    }
}
