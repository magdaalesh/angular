package AST.Nodes;

public class ArrayItemNode {
    private String key;
    private Value value;

    public ArrayItemNode(String key, Value value) {
        this.key = key;
        this.value = value;
    }

    public ArrayItemNode(Value value) {
        this.value = value;
    }

    public String getKey() { return key; }
    public Value getValue() { return value; }

    @Override
    public String toString() {
        if (key != null) {
            return key + ":" + value;
        } else {
            return value.toString();
        }
    }
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();

        if (key != null && !key.isEmpty()) {
            sb.append("\"").append(key).append("\": ");
        }

        if (value != null) {
            Object valObj = value.codegenerate();
            if (valObj instanceof String) {
                sb.append("\"").append(valObj).append("\"");
            } else {
                sb.append(valObj);
            }
        } else {
            sb.append("null");
        }

        return sb.toString();
    }

}
