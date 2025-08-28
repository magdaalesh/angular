package AST.Nodes;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MethodDefinitionNode extends ClassBodyEntry {
    private final String methodName;
    private final List<ParameterNode> parameters;
    private final TypeAnnotationNode returnType; //
    private final List<MethodBody> bodyItems;        //

    public MethodDefinitionNode(String methodName,
                                List<ParameterNode> parameters,
                                TypeAnnotationNode returnType,
                                List<MethodBody> bodyItems) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.bodyItems = bodyItems;
    }

    public String getMethodName() { return methodName; }
    public List<ParameterNode> getParameters() { return parameters; }
    public TypeAnnotationNode getReturnType() { return returnType; }
    public List<MethodBody> getBodyItems() { return bodyItems; }

    @Override
    public String codegenerate() {

        String paramsStr = (parameters == null || parameters.isEmpty())
                ? ""
                : parameters.stream()
                .map(ParameterNode::codegenerate)
                .collect(Collectors.joining(", "));

        StringBuilder sb = new StringBuilder();

        for (MethodBody item : bodyItems) {
            System.out.println("dvfdg"+item.codegeneratee());

            boolean b = item instanceof ReturnStatement;
            if (!b) {
                sb.append("    ").append(item.codegenerate()).append(";\n");

            } else{
                sb.append("    return ").append( item.codegenerate()).append(";\n");

            }
        }


        return methodName + "(" + paramsStr + ") {\n" +
                "  " + sb + "\n" +
                "}";
    }

    @Override
    public String toString() {
        return "MethodDefinitionNode{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                ", returnType=" + returnType +
                ", bodyItems=" + bodyItems +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MethodDefinitionNode)) return false;
        MethodDefinitionNode that = (MethodDefinitionNode) o;
        return Objects.equals(methodName, that.methodName) &&
                Objects.equals(parameters, that.parameters) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(bodyItems, that.bodyItems);
    }

    @Override public int hashCode() {
        return Objects.hash(methodName, parameters, returnType, bodyItems);
    }
}
