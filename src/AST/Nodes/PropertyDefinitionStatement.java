package AST.Nodes;

public class PropertyDefinitionStatement extends StatementNode {
    private PropertyDefinitionNode property;

    public PropertyDefinitionStatement(PropertyDefinitionNode property) {
        this.property = property;
    }

    public PropertyDefinitionNode getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "PropertyDefinitionStatement{" +
                "property=" + property +
                '}';
    }
}
