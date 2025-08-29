package AST.Nodes;

import java.util.Objects;

public final class VarAssignStatement extends MethodBody {
    private final String name;
    private final Value value;

    public VarAssignStatement(String name, Value value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    public String getName() { return name; }
    public Value getValue() { return value; }

    @Override
    public String toString() {
        return "VarAssign(" + name + " = " + value + ")";
    }

    @Override
    protected String codegenerateInternal() {
        return name + " = " + value.codegenerate() + ";";
    }
}
