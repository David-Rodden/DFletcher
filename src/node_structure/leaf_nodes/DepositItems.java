package node_structure.leaf_nodes;

import node_structure.BranchNode;
import node_structure.LeafNode;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.container.impl.bank.Bank;

public class DepositItems extends LeafNode {
    public DepositItems(final MethodContext context, final BranchNode parent) {
        super(context, parent);
    }

    @Override
    public boolean execute() {
        final Bank bank = getContext().getBank();
        bank.depositAll("Maple logs");
        MethodContext.sleepUntil(this::isParentConditionValid, 4000);
        return TASK_SUCCESS;
    }
}