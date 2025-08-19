package AST.Nodes;

public class StyleBackAttribute extends CssAttribute {
    private String value;

    public StyleBackAttribute(String value) {
        this.value = value;
    }
@Override
    public String getvalue() {
        return value;
    }

    @Override
    public String toString() {
        return "StyleBackgroundAttribute{value='" + value + "'}";
    }

    @Override
    public String getname() {
        return "styleback";
    }
}
