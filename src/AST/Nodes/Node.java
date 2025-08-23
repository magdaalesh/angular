package AST.Nodes;
import AST.Nodes.Expr;



public  abstract class Node {

    public abstract String toString();
    public Expr asExpr() {
        throw new IllegalStateException(
                "This node is not an expression: " + getClass().getName()
        );
    }

}


