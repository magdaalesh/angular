package AST.Nodes;

import java.util.List;

public class MethodDefinitionNode  extends ClassBodyEntry {
    private String methodName;
    private List<ParameterNode> parameters;
    private List<StatementNode> body;
    private List<ClassBodyEntry> bodyy;
    private  List<ColorValue> colorvalues;
    public MethodDefinitionNode(String methodName, List<ParameterNode> parameters, List<StatementNode> body ,List<ClassBodyEntry> bodyy , List<ColorValue> colorvalues) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.body = body;
        this.bodyy=bodyy;
        this.colorvalues = colorvalues;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "MethodDefinitionNode{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                ", body=" + body + bodyy+
                '}';
    }
}
