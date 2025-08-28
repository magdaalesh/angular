package AST.Nodes;

import java.util.List;

public class ImageNode extends HtmlNode {
    private List<HtmlAttribute> attributes;

    public ImageNode(List<HtmlAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "ImageNode{attributes=" + attributes + '}';
    }

    @Override
    public String code() {
        StringBuilder sb = new StringBuilder();
        sb.append("<img");

        if (attributes != null) {
            for (HtmlAttribute attr : attributes) {
                sb.append(" ").append(attr.code());
            }
        }

        sb.append(">");
        return sb.toString();
    }
}
