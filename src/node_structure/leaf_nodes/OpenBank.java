package node_structure.leaf_nodes;

import node_structure.BranchNode;
import node_structure.LeafNode;
import org.dreambot.api.methods.MethodContext;

public class OpenBank extends LeafNode {
    public OpenBank(final MethodContext context, final BranchNode parent) {
        super(context, parent);
    }

    @Override
    public void execute() {
        getContext().getBank().open();
        MethodContext.sleepUntil(this::isParentConditionValid, 3000);
    }
}
