package AST.Nodes;

import java.util.*;

public final class ReturnStatement extends MethodBody {
    private final boolean hasReturn;
    private final List<Expr> expressions;

    public ReturnStatement(boolean hasReturn, List<Expr> expressions) {
        this.hasReturn = hasReturn;
        this.expressions = (expressions == null) ? Collections.emptyList()
                : new ArrayList<>(expressions);
    }

    public boolean hasReturn() { return hasReturn; }
    public List<Expr> getExpressions() { return Collections.unmodifiableList(expressions); }

    @Override public String toString() {
        return (hasReturn ? "return " : "") + expressions;
    }
}
