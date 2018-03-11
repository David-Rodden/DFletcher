package node_structure;

import org.dreambot.api.methods.MethodContext;

public class LeafNode implements TaskEvent {
    private final MethodContext context;
    private BranchNode parent;

    public LeafNode(final MethodContext context, final BranchNode parent) {
        this.context = context;
        this.parent = parent;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void execute() {
    }

    protected MethodContext getContext() {
        return context;
    }

    /**
     * A quick means of checking whether the leaf node has successfully executed
     * Used solely within the context of a #sleepUntil within the #execute method
     * @return
     */
    protected boolean isParentConditionValid(){
        return parent.isValid();
    }
}
