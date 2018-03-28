package node_structure.leaf_nodes;

import items.FletchingResources;
import node_structure.BranchNode;
import node_structure.LeafNode;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.container.impl.bank.Bank;

public class WithdrawItems extends LeafNode {
    public WithdrawItems(final MethodContext context, final BranchNode parent) {
        super(context, parent);
    }

    @Override
    public boolean execute() {
        final MethodContext context = getContext();
        final boolean hasKnife = context.getInventory().contains("Knife");
        final Bank bank = context.getBank();
        if ((!hasKnife && !bank.contains("Knife")) || !bank.contains(FletchingResources.YEW_LOGS.getName()))
            return TASK_FAILURE;
        bank.withdraw(!hasKnife ? "Knife" : FletchingResources.YEW_LOGS.getName(), !hasKnife ? 1 : 27);
        final Inventory inventory = context.getInventory();
        MethodContext.sleepUntil(() -> !hasKnife ? inventory.contains("Knife") : inventory.contains(FletchingResources.YEW_LOGS.getName()), 2000);
        return TASK_SUCCESS;
    }

    @Override
    public String getTaskDescription() {
        return "Withdrawing resources";
    }
}
