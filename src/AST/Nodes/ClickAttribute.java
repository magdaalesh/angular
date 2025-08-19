package AST.Nodes;

import java.util.List;

public class ClickAttribute extends CssAttribute  {
    private String methodName;
    private List<String> arguments;

    public ClickAttribute(String methodName, List<String> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "ClickAttribute{method='" + methodName + "', args=" + arguments + '}';
    }

    @Override
    public String getname() {
        return "click";
    }

    @Override
    public String getvalue() {
        return methodName;
    }
}
