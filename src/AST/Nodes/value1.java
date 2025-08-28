package AST.Nodes;

public class value1 extends PropertyDefinitionNode{
    private String name;
    private String type;
    private boolean isOptional;
    private Value defaultValue;

    public value1() {
        this.name = "";
        this.type = "";
        this.isOptional = false;
        this.defaultValue = null;
    }

    public value1(String name, String type, boolean isOptional, Value defaultValue) {
        this.name = name;
        this.type = type;
        this.isOptional = isOptional;
        this.defaultValue = defaultValue;
    }

    // Getter و Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean optional) {
        isOptional = optional;
    }

    public Value getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Value defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "PropertytypeNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", optional=" + isOptional +
                ", defaultValue=" + defaultValue +
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
