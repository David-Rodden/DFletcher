package node_structure;

import org.dreambot.api.methods.MethodContext;

public class LeafNode extends BranchNode implements TaskEvent {
    protected static final boolean TASK_SUCCESS = false, TASK_FAILURE = true;
    private BranchNode parent;

    public LeafNode(final MethodContext context, final BranchNode parent) {
        super(context);
        this.parent = parent;
    }

    @Override
    public boolean execute() {
        return false;
    }

    /**
     * A quick means of checking whether the leaf node has successfully executed
     * Used solely within the context of a #sleepUntil within the #execute method
     *
     * @return
     */
    protected boolean isParentConditionValid() {
        return parent.isValid();
    }

    public String getTaskDescription(){
        return "No current task";
    }
}
