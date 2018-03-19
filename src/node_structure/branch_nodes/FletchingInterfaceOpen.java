package node_structure.branch_nodes;

import node_structure.BranchNode;
import org.dreambot.api.methods.MethodContext;

public class FletchingInterfaceOpen extends BranchNode{

    public FletchingInterfaceOpen(final MethodContext context) {
        super(context);
    }

    @Override
    public boolean isValid() {
        return getContext().getWidgets().getWidget(270).isVisible();
    }
}
