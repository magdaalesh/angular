package AST.Nodes;

public class CalculateColorStatement extends StatementNode {
    private String targetVariable;
    private String functionName;
    private String innerFunction;
    private String calculationOperator;
    private String operand;
    private String arrayAccessKey;

    public CalculateColorStatement(
            String targetVariable,
            String functionName,
            String innerFunction,
            String calculationOperator,
            String operand,
            String arrayAccessKey
    ) {
        this.targetVariable = targetVariable;
        this.functionName = functionName;
        this.innerFunction = innerFunction;
        this.calculationOperator = calculationOperator;
        this.operand = operand;
        this.arrayAccessKey = arrayAccessKey;
    }

    public String getTargetVariable() {
        return targetVariable;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getInnerFunction() {
        return innerFunction;
    }

    public String getCalculationOperator() {
        return calculationOperator;
    }

    public String getOperand() {
        return operand;
    }

    public String getArrayAccessKey() {
        return arrayAccessKey;
    }

    @Override
    public String toString() {
        return "CalculateColorStatement{" +
                "targetVariable='" + targetVariable + '\'' +
                ", functionName='" + functionName + '\'' +
                ", innerFunction='" + innerFunction + '\'' +
                ", calculationOperator='" + calculationOperator + '\'' +
                ", operand='" + operand + '\'' +
                ", arrayAccessKey='" + arrayAccessKey + '\'' +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder js = new StringBuilder();

        String target = targetVariable;
        if (arrayAccessKey != null && !arrayAccessKey.isEmpty()) {
            target += "[" + arrayAccessKey + "]";
        }

        String value = "";
        if (innerFunction != null && !innerFunction.isEmpty()) {
            value = innerFunction + "(" + operand + ")";
        } else {
            value = operand;
        }

        // توليد جملة JS
        js.append(target)
                .append(" = ")
                .append(functionName)
                .append("(")
                .append(target)
                .append(" ")
                .append(calculationOperator)
                .append(" ")
                .append(value)
                .append(");");

        return js.toString();
    }

}
