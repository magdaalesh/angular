package AST.Nodes;

public class Type1Node extends ContenttNode {
    private String left;
    private String right;

    public Type1Node(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String getLeft() { return left; }
    public String getRight() { return right; }

    @Override
    public String toString() {
        return "Type1Node{" +
                "left='" + left + '\'' +
                ", right='" + right + '\'' +
                '}';
    }

    @Override
    public String codegenerae() {

        return left + ": " + right;
    }
}
