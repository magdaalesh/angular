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
}
