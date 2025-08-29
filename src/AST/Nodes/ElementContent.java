package AST.Nodes;

public class ElementContent extends Content {
    private HtmlNode element;

    public ElementContent(HtmlNode element) {
        this.element = element;
    }

    public HtmlNode getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "ElementContent{" +
                "element=" + element +
                '}';
    }

    @Override
    public String codegenerate() {
        if (element != null) {
            return element.codegenerate();
        }
        return "";
    }
}
