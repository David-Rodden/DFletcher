package micro_handler;

import node_structure.BranchNode;

public class FletchingHandler {
    private final BranchNode root;

    public FletchingHandler(final BranchNode root) {
        this.root = root;
    }

    public void verify() {
        BranchNode pointer = root;
        while (!pointer.isChildLeaf())
            pointer = pointer.isValid() ? pointer.getSuccess() : pointer.getFailure();
    }
}
