package AST.Nodes;

import java.util.List;

public class NgSubmitAttribute extends CssAttribute {
    private String functionName;
    private List<String> arguments;

    public NgSubmitAttribute(String functionName, List<String> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "NgSubmitAttribute{" + functionName + "(" + String.join(", ", arguments) + ")}";
    }

    @Override
    public String getname() {
        return "ngsubmit";
    }

    @Override
    public String getvalue() {
        return functionName + "(" + String.join(", ", arguments) + ")";
    }

    @Override
    public String code() {
        return " onsubmit=\"" + getvalue() + "; return false\"";
    }

}
