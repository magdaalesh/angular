package AST.Nodes;

public class NgIfAttribute extends CssAttribute {
    private String condition;

    public NgIfAttribute(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String getname() {
        return "ngIf";
    }

    @Override
    public String getvalue() {
        return condition;
    }

    @Override
    public String code() {

        return  "";
    }

    @Override
    public String toString() {
        return "NgIfAttribute{condition='" + condition + "'}";
    }
}
