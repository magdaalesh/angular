package AST.Nodes;

public class StringContent extends HtmlNode {
    private String text;

    public StringContent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
