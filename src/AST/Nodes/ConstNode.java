package AST.Nodes;

import java.util.List;

public class ConstNode extends PropertyDefinitionNode {
    private String name;
    private String typeOrValue;
    private List<ParameterNode> parameters;

    public ConstNode(String name, String typeOrValue, List<ParameterNode> parameters) {
        this.name = name;
        this.typeOrValue = typeOrValue;
        this.parameters = parameters;
    }

    public ConstNode() {
        this.name = null;
        this.typeOrValue = null;
        this.parameters = null;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTypeOrValue() { return typeOrValue; }
    public void setTypeOrValue(String typeOrValue) { this.typeOrValue = typeOrValue; }

    public List<ParameterNode> getParameters() { return parameters; }
    public void setParameters(List<ParameterNode> parameters) { this.parameters = parameters; }

    @Override
    public String toString() {
        return "ConstNode{" +
                "name='" + name + '\'' +
                ", typeOrValue='" + typeOrValue + '\'' +
                ", parameters=" + parameters +
                '}';
    }
    @Override
    public String codegenerate() {
        return codegenerae();
    }
    @Override
    public String codegenerae() {
        if (name == null || name.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        sb.append("const ").append(name);

        if (parameters != null && !parameters.isEmpty()) {
            sb.append(" = (");
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i).codegenerate());
                if (i < parameters.size() - 1) sb.append(", ");
            }
            sb.append(") => ");
            sb.append(typeOrValue != null ? typeOrValue : "null");
        } else {
            if (typeOrValue != null && !typeOrValue.isEmpty()) {
                sb.append(" = ").append(typeOrValue);
            }
        }

        sb.append(";");
        return sb.toString();
    }

}
