package AST.Nodes;

public class ArrayDefinitionStatement extends nodebodyclass {
    private ArrayDefinitionNode arrayDefinition;

    public ArrayDefinitionStatement(ArrayDefinitionNode arrayDefinition) {
        this.arrayDefinition = arrayDefinition;
    }

    public ArrayDefinitionNode getArrayDefinition() {
        return arrayDefinition;
    }

    @Override
    public String toString() {
        return "ArrayDefinitionStatement{" +
                "arrayDefinition=" + arrayDefinition +
                '}';
    }

    @Override
    public String codegenerate() {

        if (arrayDefinition != null) {
            return arrayDefinition.codegenerate();
        }
        return "";
    }
}
