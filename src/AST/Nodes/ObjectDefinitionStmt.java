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

    @Override
    public String codegeneratee() {
        StringBuilder sb = new StringBuilder();

        if (arrayTyped) {
            sb.append(name).append(" = [");
            sb.append(String.join(" ", entries));
            sb.append("]");
        } else {
           sb.append(name).append(" = {");
            for (int i = 0; i < entries.size(); i++) {
                String entry = entries.get(i);
                sb.append(entry);
                if (i < entries.size() - 1) sb.append(" ");
            }
            sb.append("}");
        }

        return sb.toString();
    }


}
