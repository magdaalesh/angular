package AST.Nodes;

public class NgIfAttribute extends CssAttribute  {
    private String condition;

    public NgIfAttribute(String condition) {
        this.condition = condition;
    }

    @Override
    public String getvalue() {
        return condition;
    }

    @Override
    public String toString() {
        return "NgIfAttribute{condition='" + condition + "'}";
    }

    @Override
    public String getname() {
        return "ngif";
    }
}
