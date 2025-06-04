package AST.Nodes;

public class StyleBackAttribute extends CssAttribute {
    private String value;

    public StyleBackAttribute(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StyleBackgroundAttribute{value='" + value + "'}";
    }
}
