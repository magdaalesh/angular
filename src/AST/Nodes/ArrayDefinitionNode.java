package AST.Nodes;

import java.util.List;

public class ArrayDefinitionNode extends ClassBodyEntry   {
    private String modifier;       // CONST أو MODIFIER
    private String name;           // اسم المصفوفة
    private String type;           // النوع (TYPE أو ID[])
    private List<ArrayItemNode> items; // عناصر المصفوفة

    public ArrayDefinitionNode(String modifier, String name, String type, List<ArrayItemNode> items) {
        this.modifier = modifier;
        this.name = name;
        this.type = type;
        this.items = items;
    }

    public String getModifier() { return modifier; }
    public String getName() { return name; }
    public String getType() { return type; }
    public List<ArrayItemNode> getItems() { return items; }

    @Override
    public String toString() {
        return "ArrayDefinitionNode{" +
                "modifier='" + modifier + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", items=" + items +
                '}';
    }
}
