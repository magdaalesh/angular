package AST.Nodes;

public final class IdCondNode extends ConditionNode {
    private final String left;
    private final String op;
    private final String sign;
    private final String right;

    public IdCondNode(String left, String op, String sign, String right) {
        this.left = left;
        this.op = op;
        this.sign = sign;
        this.right = right;
    }

    public String getLeft()  { return left; }
    public String getOp()    { return op; }
    public String getSign()  { return sign; }
    public String getRight() { return right; }

    @Override
    public String toString() {
        return left + " " + op + " " + (sign == null ? "" : sign) + right;
    }

    @Override
    public String codegenerate() {
        return left + " " + op + " " + (sign == null ? "" : sign) + right;
    }
}
