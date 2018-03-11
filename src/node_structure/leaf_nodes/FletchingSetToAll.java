package node_structure.leaf_nodes;

import node_structure.BranchNode;
import node_structure.LeafNode;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.wrappers.widgets.WidgetChild;

public class FletchingSetToAll extends LeafNode {
    public FletchingSetToAll(final MethodContext context, final BranchNode parent) {
        super(context, parent);
    }

    @Override
    public void execute() {
        final WidgetChild allButton = getContext().getWidgets().getWidgetChild(270, 12);
        if(allButton == null)   return;
        allButton.interact();
        MethodContext.sleepUntil(this::isParentConditionValid, 3000);
    }
}