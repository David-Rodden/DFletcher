package node_structure.leaf_nodes;

import node_structure.BranchNode;
import node_structure.LeafNode;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;

public class Combination extends LeafNode {
    public Combination(final MethodContext context, final BranchNode parent) {
        super(context, parent);
    }

    @Override
    public boolean execute() {
        getContext().getInventory().get("Knife").useOn("Maple logs");
        MethodProvider.sleepUntil(this::isParentConditionValid, 5000);
        return TASK_SUCCESS;
    }
}
