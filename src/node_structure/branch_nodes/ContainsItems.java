package node_structure.branch_nodes;

import node_structure.BranchNode;
import org.dreambot.api.methods.MethodContext;

public class ContainsItems extends BranchNode {
    public ContainsItems(final MethodContext context) {
        super(context);
    }

    @Override
    public boolean isValid() {
        return getContext().getInventory().containsAll("Knife", "Maple logs");
    }
}
