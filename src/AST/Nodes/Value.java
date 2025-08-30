package AST.Nodes;

public abstract class Value extends Node {

    @Override
    public String toString() {
        return this.codegenerate();
    }

    @Override
    public String codegenerate() {
        System.out.println(this.codegenerateInternal());
        return this.codegenerateInternal();
    }

    protected abstract String codegenerateInternal();
}
