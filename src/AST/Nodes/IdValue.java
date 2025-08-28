package AST.Nodes;

import java.util.List;

public class IdValue extends Value {
    private List<String> identifiers;

    public IdValue(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String toString() {
        return "IdValue{" +
                "identifiers=" + identifiers +
                '}';
    }


    @Override
    public String codegenerate() {
        return String.join(".", identifiers);
    }
}
