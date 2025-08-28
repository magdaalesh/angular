package AST.Nodes;

import java.util.*;

public final class OperationCondNode extends ConditionNode {
    private final String firstId;
    private final List<String> ops;
    private final List<String> ids;

    public OperationCondNode(String firstId, List<String> ops, List<String> ids) {
        this.firstId = Objects.requireNonNull(firstId);
        this.ops = Collections.unmodifiableList(new ArrayList<>(ops));
        this.ids = Collections.unmodifiableList(new ArrayList<>(ids));
    }

    public String getFirstId() { return firstId; }
    public List<String> getOps() { return ops; }
    public List<String> getIds() { return ids; }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder(firstId);
        for (int i = 0; i < ops.size() && i < ids.size(); i++) {
            sb.append(' ').append(ops.get(i)).append(' ').append(ids.get(i));
        }
        return sb.toString();
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return "";
    }
}
