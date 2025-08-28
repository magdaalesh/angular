package AST.Nodes;

public class AssignmentStatement extends StatementNode {
    private String variableName;
    private Object value;

    public AssignmentStatement(String variableName, Object value) {
        this.variableName = variableName;
        this.value = value;
    }

    public String getVariableName() {
        return variableName;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AssignmentStatement{" +
                "variableName='" + variableName + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder js = new StringBuilder();

        if (value instanceof String) {
            js.append(variableName).append(" = ").append("\"").append(value).append("\"");
        } else if (value instanceof Number || value instanceof Boolean) {
            js.append(variableName).append(" = ").append(value);
        } else if (value instanceof Node) {
            js.append(variableName).append(" = ").append(((Node) value).codegenerate());
        } else {

            js.append(variableName).append(" = ").append(value);
        }

        js.append(";");
        return js.toString();
    }

}
