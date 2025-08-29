package AST.Nodes;

public abstract class Node {

    @Override
    public abstract String toString();

    public Expr asExpr() {
        throw new IllegalStateException(
                "This node is not an expression: " + getClass().getName()
        );
    }

    public abstract String codegenerate();
}
