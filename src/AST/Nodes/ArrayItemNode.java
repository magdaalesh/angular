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
}
