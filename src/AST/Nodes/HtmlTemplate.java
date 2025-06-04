package AST.Nodes;

import java.util.List;

public class HtmlTemplate {

    private List<HtmlNode> children;

    public HtmlTemplate(List<HtmlNode> children) {
         this.children=children;
    }
    public HtmlTemplate(){
        this.children = null;
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    public void setChildren(List<HtmlNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlTemplate{");

        if (children != null && !children.isEmpty()) {
            sb.append("\n");

            for (HtmlNode child : children) {

                sb.append("  ").append(child.toString()).append("\n");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}
