package AST.Nodes;

public class TextContent extends Content {
    private String text;

    public TextContent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "TextContent{" +
                "text='" + text + '\'' +
                '}';
    }
}
