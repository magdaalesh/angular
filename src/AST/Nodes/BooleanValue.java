package AST.Nodes;

public class BooleanValue extends Value {
    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() { return value; }

    @Override
    public String toString() {
        return "BooleanValue{" +
                "value=" + value +
                '}';
    }

    @Override
    public String codegenerate() {
        return Boolean.toString(value);
    }

    @Override
    protected String codegenerateInternal() {
        return codegenerate();
    }
}
