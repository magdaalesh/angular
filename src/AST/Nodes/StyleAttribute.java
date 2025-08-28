package AST.Nodes;

import java.util.Map;

public class StyleAttribute extends CssAttribute {
    private Map<String, String> styles;

    public StyleAttribute(Map<String, String> styles) {
        this.styles = styles;
    }
    @Override
    public String getvalue() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : styles.entrySet()) {
            result.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue()).append(" ")
                    .append("; ");
        }
        return result.toString().trim();
    }

    @Override
    public String code() {

        StringBuilder styleString = new StringBuilder();
        for (Map.Entry<String, String> entry : styles.entrySet()) {
            styleString.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue()).append(" ")
                    .append("; ");
        }

        return " style=\"" + styleString.toString() + "\"";
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
