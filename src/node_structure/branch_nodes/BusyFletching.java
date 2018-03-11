package node_structure.branch_nodes;

import node_structure.BranchNode;
import org.dreambot.api.methods.MethodContext;

public class BusyFletching extends BranchNode {
    protected BusyFletching(final MethodContext context) {
        super(context);
    }

    @Override
    public boolean isValid() {
        final FletchingInspector fletchingInspector = new FletchingInspector();
        MethodContext.sleepUntil(() -> {
            if (getContext().getLocalPlayer().isAnimating()) fletchingInspector.setHasFletched(true);
            return fletchingInspector.hasFletched();
        }, 5000);
        return fletchingInspector.hasFletched();
    }
}
