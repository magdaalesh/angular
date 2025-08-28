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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOrValue() {
        return typeOrValue;
    }

    public void setTypeOrValue(String typeOrValue) {
        this.typeOrValue = typeOrValue;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "ConstNode{" +
                "name='" + name + '\'' +
                ", typeOrValue='" + typeOrValue + '\'' +
                ", parameters=" + parameters +
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
