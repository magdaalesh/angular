package AST.Nodes;

import java.util.Objects;

public final class ThisPropExpr extends Expr {
    private final String name;

    public ThisPropExpr(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() { return name; }

    @Override
    public String toString() { return name; }

    // هذا الذي يرثه Expr
    @Override
    public String codegenerateInternal() {
        return name;
    }


}
