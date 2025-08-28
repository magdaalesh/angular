package AST.Nodes;

public class NgForAttribute extends CssAttribute  {
    private String variable;
    private String collection;

    public NgForAttribute(String variable, String collection) {
        this.variable = variable;
        this.collection = collection;
    }

    public String getVariable() {
        return variable;
    }

    public String getCollection() {
        return collection;
    }

    @Override
    public String toString() {
        return "NgForAttribute{let " + variable + " of " + collection + "}";
    }

    @Override
    public String getname() {
        return "ngfor";
    }

    @Override
    public String getvalue() {
        return"let " + getVariable()+ " of "+getCollection()  ;
    }

    /**
     * @return
     */
    @Override
    public String code() {
        return "";
    }
}
