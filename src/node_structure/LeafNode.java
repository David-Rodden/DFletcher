package node_structure;

import org.dreambot.api.methods.MethodContext;

public class LeafNode implements TaskEvent {
    private final MethodContext context;
    private BranchNode success, failure;

    public LeafNode(final MethodContext context) {
        this.context = context;
    }

    public BranchNode getSuccess() {
        return success;
    }

    public BranchNode getFailure() {
        return failure;
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
}
