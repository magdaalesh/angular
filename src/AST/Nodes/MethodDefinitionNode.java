package AST.Nodes;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// إن كان عندك ClassBodyEntry يورّث Node:
public class MethodDefinitionNode extends ClassBodyEntry
// لو ما عندك ClassBodyEntry، استعمل السطر التالي بدل الأعلى:
// public class MethodDefinitionNode extends Node
{
    private final String methodName;
    private final List<ParameterNode> parameters;
    private final TypeAnnotationNode returnType; // ممكن يكون null
    private final List<Object> bodyItems;        // عناصر جسم الدالة

    public MethodDefinitionNode(String methodName,
                                List<ParameterNode> parameters,
                                TypeAnnotationNode returnType,
                                List<Object> bodyItems) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.bodyItems = bodyItems;
    }

    public String getMethodName() { return methodName; }
    public List<ParameterNode> getParameters() { return parameters; }
    public TypeAnnotationNode getReturnType() { return returnType; }
    public List<Object> getBodyItems() { return bodyItems; }

    @Override
    public String toString() {
        String paramsStr = (parameters == null || parameters.isEmpty())
                ? "[]"
                : "[" + parameters.stream()
                .map(p -> p == null ? "?" : p.toString())
                .collect(java.util.stream.Collectors.joining(", ")) + "]";

        String bodyStr = (bodyItems == null || bodyItems.isEmpty())
                ? "[]"
                : "[" + bodyItems.stream()
                .map(x -> x == null ? "null" : x.toString())
                .collect(java.util.stream.Collectors.joining("; ")) + "]";

        StringBuilder sb = new StringBuilder();
        sb.append("MethodDefinition{ name=").append(methodName);

        // 👇 لا نطبع النوع إلا إذا حاضر فعلاً حسب القاعدة
        if (returnType != null) {
            sb.append(", type=").append(returnType.toString());
        }

        sb.append(", body=").append(bodyStr);
        sb.append(", params=").append(paramsStr);
        sb.append(" }");
        return sb.toString();
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
