package AST.Nodes;

public class DefinitionNode extends PropertyDefinitionNode {
    private String name;
    private boolean optional;
    private String type;
    private Value value;

    public DefinitionNode(String name, boolean optional, String type, Value value) {
        this.name = name;
        this.optional = optional;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public boolean isOptional() {
        return optional;
    }

    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PropertyDefinitionNode{" +
                "name='" + name + '\'' +
                ", optional=" + optional +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();


        sb.append(name);
        if (optional) {
            sb.append("?");
        }


        if (type != null && !type.isEmpty()) {
            sb.append(" /* type: ").append(type).append(" */");
        }

        // القيمة الافتراضية
        if (value != null) {
            Object valObj = value.codegenerate();
            sb.append(" = ");
            if (valObj instanceof String) {
                sb.append("\"").append(valObj).append("\"");
            } else {
                sb.append(valObj);
            }
        }

        sb.append(";");

        return sb.toString();
    }

    /**
     * @return
     */
    @Override
    public String codegenerae() {
        return "";
    }

}
