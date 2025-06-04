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
}
