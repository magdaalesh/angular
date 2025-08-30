package AST.Nodes;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MethodDefinitionNode extends ClassBodyEntry {
    private final String methodName;
    private final List<ParameterNode> parameters;
    private final TypeAnnotationNode returnType;
    private final List<MethodBody> bodyItems;

    public MethodDefinitionNode(String methodName,
                                List<ParameterNode> parameters,
                                TypeAnnotationNode returnType,
                                List<MethodBody> bodyItems) {
        this.methodName  = Objects.requireNonNull(methodName, "methodName");
        this.parameters  = parameters;
        this.returnType  = returnType;
        this.bodyItems   = bodyItems;
    }

    public String getMethodName()             { return methodName; }
    public List<ParameterNode> getParameters(){ return parameters; }
    public TypeAnnotationNode getReturnType() { return returnType; }
    public List<MethodBody> getBodyItems()    { return bodyItems; }

    @Override
    public String codegenerate() {
        String paramsStr = (parameters == null || parameters.isEmpty())
                ? ""
                : parameters.stream()
                .map(ParameterNode::codegenerate)
                .collect(Collectors.joining(", "));

        StringBuilder bodySb = new StringBuilder();
        if (bodyItems != null) {
            for (MethodBody item : bodyItems) {
                if (item == null) continue;

                String line = item.codegenerate();  //
                if (line == null) continue;

                line = line.trim();
                if (line.isEmpty()) continue; //

                boolean needsSemicolon = !(line.endsWith(";") || line.endsWith("{") || line.endsWith("}"));
                if (needsSemicolon) line += ";";

                bodySb.append("  ").append(line).append("\n");
            }
        }

        return methodName + "(" + paramsStr + ") {\n" + bodySb + "}";
    }



    @Override
    public String codegenerae() {
        return "";
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
}
