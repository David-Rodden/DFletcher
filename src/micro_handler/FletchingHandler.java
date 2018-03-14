package micro_handler;

import node_structure.BranchNode;
import node_structure.LeafNode;

import java.util.Random;

public class FletchingHandler {
    private final BranchNode root;
    private final Random random;

    public FletchingHandler(final BranchNode root) {
        this.root = root;
        random = new Random();

    }

    public int verify() {
        BranchNode pointer = root;
        while (!(pointer instanceof LeafNode))
            pointer = pointer.isValid() ? pointer.getSuccess() : pointer.getFailure();
        return ((LeafNode) pointer).execute()? -1: random.nextInt(1500);
    }
}
