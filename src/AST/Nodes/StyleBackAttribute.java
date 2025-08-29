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
    public String code() {
        return " style=\"background: " + value + "\"";
    }

    @Override
    public String toString() {
        return "StyleBackAttribute{value='" + value + "'}";
    }

    @Override
    public String getname() {
        return "styleback";
    }
}
