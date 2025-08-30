package AST.Nodes;

public abstract class Value extends Node {

    @Override
    public String toString() {
        return this.codegenerate();
    }

    @Override
    public String codegenerate() {

        return this.codegenerateInternal();
    }

    public abstract String codegenerateInternal();
}
