package AST.Nodes;

public class ConstructorParam extends Node {
    private final String modifier;
    private final String name;
    private final String type;

    public ConstructorParam(String modifier, String name, String type) {
        this.modifier = modifier;
        this.name = name;
        this.type = type;
    }

    public String getModifier() { return modifier; }
    public String getName()     { return name; }
    public String getType()     { return type; }

    @Override
    public String toString() {
        return "ConstructorParam{" +
                "modifier='" + modifier + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return getName();
    }
}
