package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public abstract class HtmlNode extends Node {
    protected List<HtmlNode> children = new ArrayList<>();

    public void addChild(HtmlNode child) {
        children.add(child);
    }

    public abstract String code();
    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();

        sb.append(code());


        for (HtmlNode child : children) {
            sb.append(child.codegenerate());
        }

        return sb.toString();
    }

    @Override
    public abstract String toString();
}
