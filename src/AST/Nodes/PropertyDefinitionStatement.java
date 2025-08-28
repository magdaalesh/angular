package AST.Nodes;

import java.util.Objects;

public final class PropertyDefinitionStatement extends MethodBody {
    private final PropertyDefinitionNode property;

    public PropertyDefinitionStatement(PropertyDefinitionNode property) {
        this.property = Objects.requireNonNull(property);
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
   public String codegeneratee(){
        return  property.codegenerate();
    }
}
