// ValueStatement.java
package AST.Nodes;

import java.util.Objects;

public final class ValueStatement extends MethodBody {
    private final Expr expr;

    public ValueStatement(Expr expr) {
        this.expr = Objects.requireNonNull(expr);
    }

    public ValueStatement(Value value) {
        this(new ValueExpr(null, Objects.requireNonNull(value)));
    }

    public Expr getExpr() { return expr; }

    @Override public String toString() { return "ValueStmt(" + expr + ")"; }

    /**
     * @return
     */
    @Override
    public String codegeneratee() {
        return expr.codegenerate();
    }
}
