package AST.Nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class IfStatementNode extends MethodBody {
    private final ConditionNode condition;
    private final List<MethodBody> thenBody;

    public IfStatementNode(ConditionNode condition, List<MethodBody> thenBody) {
        this.condition = Objects.requireNonNull(condition);
        this.thenBody  = Collections.unmodifiableList(new ArrayList<>(thenBody));
    }

    public ConditionNode getCondition()   { return condition; }
    public List<MethodBody> getThenBody() { return thenBody; }

    @Override
    public String toString() {
        return "If(" + condition + ") " + thenBody;
    }
}
