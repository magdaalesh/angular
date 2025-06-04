package AST.Nodes;
import java.util.List;

public class ElementNode extends HtmlNode {
    private String tagName;
    private List<HtmlAttribute> attributes;
    private List<HtmlNode> children;

    public ElementNode(String tagName, List<HtmlAttribute> attributes, List<HtmlNode> children) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }
    public ElementNode() {
        this.tagName = " ";
        this.attributes = null;
        this.children = null;
    }

    public String getTagName() {
        return tagName;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "ElementNode{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                ", children=" + children +
                '}';
    }
}
