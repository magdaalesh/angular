package AST.Nodes;

public class value1 extends PropertyDefinitionNode{
    private String name ;
    private String type;
    private Value value;

    public value1(String name, String type, Value value) {
      this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getType() { return type; }
    public Value getValue() { return value; }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PropertyWithTypeNode{name='" + name + "', type='" + type + "', value=" + value + "}";
    }
}
