package AST.Nodes;

public class value2 extends PropertyDefinitionNode{
  private String name ;
    private String modifier;
    private Value value;

    public value2(String name, String modifier, Value value) {
        this.name = name;
        this.modifier = modifier;
        this.value = value;
    }

    public String getModifier() { return modifier; }
    public Value getValue() { return value; }

    @Override
    public String toString() {
        return "PropertyWithModifierNode{name='" + name + "', modifier='" + modifier + "', value=" + value + "}";
    }

    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();

        if ("private".equalsIgnoreCase(modifier)) {
            sb.append("#");
        }

        sb.append(name).append(" = ");

        if (value != null) {
            sb.append(value.codegenerate());
        } else {
            sb.append("null");
        }

        sb.append(";");

        return sb.toString();
    }

}
