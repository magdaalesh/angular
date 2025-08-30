package AST.Nodes;

import java.util.Objects;

public final class SpreadItem {
    private final boolean spread;
    private final Expr expr;

    public SpreadItem(boolean spread, Expr expr) {
        this.spread = spread;
        this.expr = Objects.requireNonNull(expr, "expr");
    }

    public boolean isSpread() { return spread; }
    public Expr getExpr() { return expr; }

    @Override
    public String toString() {
        return (spread ? "..." : "") + expr;
    }

    public String codegenerate() {
        return (expr != null ? (spread ? "..." : "") + expr.codegenerate() : "");
    }
}
