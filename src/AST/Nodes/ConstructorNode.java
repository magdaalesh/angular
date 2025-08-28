package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class ConstructorNode extends ClassBodyEntry  {
    private final List<ConstructorParam> parameters = new ArrayList<>();
    private final List<Node> body = new ArrayList<>();

    public void addParam(ConstructorParam p) { if (p != null) parameters.add(p); }
    public void addBodyNode(Node n)         { if (n != null) body.add(n); }

    public List<ConstructorParam> getParameters() { return parameters; }
    public List<Node> getBody()                   { return body; }

    @Override
    public String toString() {
        return "ConstructorNode{" +
                "parameters=" + parameters +
                ", body=" + body +
                '}';
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return "";
    }
}
