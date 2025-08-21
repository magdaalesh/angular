package AST.Nodes;

import java.util.Map;

public class StyleAttribute extends CssAttribute {
    private Map<String, String> styles;

    public StyleAttribute(Map<String, String> styles) {
        this.styles = styles;
    }
@Override
    public String getvalue() {
        return styles.toString();
    }

    @Override
    public String toString() {
        return "StyleAttribute{styles=" + styles + '}';
    }

    @Override
    public String getname() {
        return "style";
    }
}
