package AST.Nodes;

public class BooleanValueNode extends PropertyDefinitionNode {
    private String name;
    private boolean value;

    public BooleanValueNode(String name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public BooleanValueNode() {
        this.name = null;
        this.value = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BooleanValueNode{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return "";
    }
}
