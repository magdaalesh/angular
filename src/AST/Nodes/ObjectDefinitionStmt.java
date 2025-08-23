package AST.Nodes;

import java.util.*;

public final class ObjectDefinitionStmt extends MethodBody {
    private final String name;
    private final String explicitType;  //
    private final boolean arrayTyped;   //
    private final String arrayType;     //
    private final List<String> entries;

    public ObjectDefinitionStmt(String name,
                                String explicitType,
                                boolean arrayTyped,
                                String arrayType,
                                List<String> entries) {
        this.name        = Objects.requireNonNull(name);
        this.explicitType= explicitType;
        this.arrayTyped  = arrayTyped;
        this.arrayType   = arrayType;
        this.entries     = Collections.unmodifiableList(new ArrayList<>(entries));
    }

    public String getName()        { return name; }
    public String getExplicitType(){ return explicitType; }
    public boolean isArrayTyped()  { return arrayTyped; }
    public String getArrayType()   { return arrayType; }
    public List<String> getEntries(){ return entries; }

    @Override
    public String toString() {
        String t = explicitType != null ? (": " + explicitType)
                : (arrayTyped ? ("[" + arrayType + "]") : "");
        return "ObjectDef " + name + t + " { " + String.join(", ", entries) + " }";
    }
}
