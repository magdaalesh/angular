package AST.Nodes;

import java.util.Objects;

public final class ValueExpr extends Expr {
    private final String constName; // ممكن يكون null
    private final Value  value;

    public ValueExpr(String constName, Value value) {
        this.constName = constName;
        this.value = Objects.requireNonNull(value, "value");
    }

    public String getConstName() { return constName; }
    public Value  getValue()     { return value; }

    @Override public String toString() {
        return constName != null ? ("const " + constName + " = " + value) : value.toString();
    }
}
