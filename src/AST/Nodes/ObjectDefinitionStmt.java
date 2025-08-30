package AST.Nodes;

import java.util.*;

public final class ObjectDefinitionStmt extends MethodBody {
    private final String name;
    private final String explicitType;
    private final boolean arrayTyped;
    private final String arrayType;
    private final List<String> entries;

    public ObjectDefinitionStmt(String name,
                                String explicitType,
                                boolean arrayTyped,
                                String arrayType,
                                List<String> entries) {
        this.name = Objects.requireNonNull(name);
        this.explicitType = explicitType;
        this.arrayTyped = arrayTyped;
        this.arrayType = arrayType;
        this.entries = Collections.unmodifiableList(new ArrayList<>(entries));
    }

    public String getName() { return name; }
    public String getExplicitType() { return explicitType; }
    public boolean isArrayTyped() { return arrayTyped; }
    public String getArrayType() { return arrayType; }
    public List<String> getEntries() { return entries; }

    @Override
    public String toString() {
        String t = explicitType != null ? (": " + explicitType)
                : (arrayTyped ? ("[" + arrayType + "]") : "");
        return "ObjectDef " + name + t + " { " + String.join(", ", entries) + " }";
    }

    @Override
    protected String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        if (explicitType != null) {
            sb.append("const ").append(name).append(" = ");
        } else {
            sb.append(name).append(" = ");
        }
        if (arrayTyped) {
            sb.append("{");
            sb.append(String.join(" ", entries));
            sb.append("}");
        } else {
            sb.append("{ ");
            for (int i = 0; i < entries.size(); i++) {
                sb.append(entries.get(i));
                if (i < entries.size() - 1) sb.append(" ");
            }
            sb.append(" }");
        }
        return sb.toString();
    }





}
