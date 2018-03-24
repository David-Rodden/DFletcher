package node_structure.leaf_nodes;

import node_structure.BranchNode;
import node_structure.LeafNode;
import org.dreambot.api.methods.MethodContext;

public class WithdrawItems extends LeafNode {
    public WithdrawItems(final MethodContext context, final BranchNode parent) {
        super(context, parent);
    }

    @Override
    public boolean execute() {
        final MethodContext context = getContext();
        final boolean hasKnife = context.getInventory().contains("Knife");
        context.getBank().withdraw(!hasKnife ? "Knife" : "Maple logs", !hasKnife ? 1 : 27);
        MethodContext.sleepUntil(this::isParentConditionValid, 5000);
        return TASK_SUCCESS;
    }

    @Override
    public String getTaskDescription() {
        return "Withdrawing resources";
    }
}
