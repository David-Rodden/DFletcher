package node_structure;

public interface TaskEvent extends TaskCondition {
    /**
     * Returns true if should quit program
     * @return
     */
    boolean execute();
}
