package AST.Nodes;

public class TextNode extends HtmlNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "TextNode{text='" + text + "'}";
    }


    @Override
    public String code() {
        return text;
    }
}
