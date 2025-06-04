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
}
