package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class HtmlTemplate extends HtmlNode {
    private List<HtmlNode> children;

    public HtmlTemplate(List<HtmlNode> children) {
        this.children = children != null ? children : new ArrayList<>();
    }

    public HtmlTemplate() {
        this.children = new ArrayList<>();
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    public void setChildren(List<HtmlNode> children) {
        this.children = children != null ? children : new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlTemplate{");
        if (!children.isEmpty()) {
            sb.append("\n");
            for (HtmlNode child : children) {
                sb.append("  ").append(child.toString()).append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String code() {
        StringBuilder sb = new StringBuilder();
        for (HtmlNode child : children) {
            sb.append(child.code());
        }
        return sb.toString();
    }
}
