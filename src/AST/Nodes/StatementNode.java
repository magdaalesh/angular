package AST.Nodes;

public abstract class StatementNode extends nodebodyclass {
    @Override
    public abstract String toString();

    @Override
    public String codegenerate() {
        return codegenerateInternal();
    }

    protected abstract String codegenerateInternal();
}
