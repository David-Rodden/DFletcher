package node_structure.leaf_nodes;

import items.FletchingResources;
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
        getContext().getInventory().get("Knife").useOn(FletchingResources.YEW_LOGS.getName());
        MethodProvider.sleepUntil(this::isParentConditionValid, 1000);
        return TASK_SUCCESS;
    }

    @Override
    public String getTaskDescription() {
        return "Combining Knife & " + FletchingResources.YEW_LOGS.getName();
    }
}
