package node_structure.branch_nodes;

import items.FletchingResources;
import node_structure.BranchNode;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.container.impl.bank.Bank;

public class BankContainsItems extends BranchNode {
    protected BankContainsItems(final MethodContext context) {
        super(context);
    }

    @Override
    public boolean isValid() {
        final MethodContext context = getContext();
        final Inventory inventory = context.getInventory();
        final Bank bank = context.getBank();
        return (inventory.contains(FletchingResources.YEW_LOGS.getName()) || bank.contains(FletchingResources.YEW_LOGS.getName())) && (inventory.contains("Knife") || (bank.contains("Knife")));
    }
}
