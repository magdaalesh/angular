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

    @Override
    public String toString() {
        return (hasReturn ? "return " : "") + expressions;
    }

    @Override
    protected String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        if (hasReturn) sb.append("return");
        if (!expressions.isEmpty()) {
            if (hasReturn) sb.append(" ");
            for (int i = 0; i < expressions.size(); i++) {
                sb.append(expressions.get(i).codegenerate());
                if (i < expressions.size() - 1) sb.append(", ");
            }
        }
        return sb.toString().trim();
    }


    @Override
    public String codegeneratee() {
        return "";
    }
}
