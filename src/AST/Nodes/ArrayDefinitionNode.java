package AST.Nodes;

import java.util.List;

public class ArrayDefinitionNode extends ClassBodyEntry   {
    private String modifier;
    private String name;
    private String type;
    private List<ArrayItemNode> items;
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

    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();

        sb.append("const ").append(name).append(" = [");

        if (items != null && !items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                ArrayItemNode item = items.get(i);

                String valueStr = item.codegenerate();

                sb.append(valueStr );

                if (i < items.size() - 1) {
                    sb.append(", ").append("\n");
                }
            }
        }

        sb.append("];");
        return sb.toString();
    }

}
