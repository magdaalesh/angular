package AST.Nodes;

public class SimpleAttributeNode extends HtmlAttribute {
    private String name;
    private String value;

    public SimpleAttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getvalue() {
        return value;
    }

    @Override
    public String code() {
        return name + "=\"" + value + "\"";
    }

    @Override
    public String toString() {
        return "SimpleAttributeNode{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
