package AST.Nodes;

public abstract class PropertyDefinitionNode extends ClassBodyEntry {


    @Override
    public abstract String codegenerate();
    public abstract String codegenerae();
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
