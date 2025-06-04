package AST.Nodes;

public class ValueStatement extends StatementNode {
    private Object value;

    public ValueStatement(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ValueStatement{" +
                "value=" + value +
                '}';
    }
}
