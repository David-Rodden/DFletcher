package node_structure.branch_nodes;

import node_structure.BranchNode;
import org.dreambot.api.methods.MethodContext;

public class FletchingSetToAll extends BranchNode{
    protected FletchingSetToAll(final MethodContext context) {
        super(context);
    }

    /**
     * If All is selected, there are no widget child actions
     * If All is NOT selected, a single option "All" will appear in the array of actions
     * This helps us distinguish between a selected & unselected All button
     * @return
     */
    @Override
    public boolean isValid() {
        return getContext().getWidgets().getWidgetChild(270, 12).getActions().length == 0;
    }
}
