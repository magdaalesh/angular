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

    /**
     * @return
     */
    @Override
    public String code() {
        return "";
    }

    @Override
    public String toString() {
        return "StyleBackgroundAttribute{value='" + value + "'}";
    }

    @Override
    public String getname() {
        return " styleback";
    }
}
