package AST.Nodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TypeAnnotationNode {
    private final String mainType;       // ID الأساسي
    private final boolean array;         // [] بعده؟
    private final List<String> unions;   // بعد PIPE (اختياري)

    public TypeAnnotationNode(String mainType, boolean array, List<String> unions) {
        this.mainType = mainType;
        this.array = array;
        this.unions = unions != null ? new ArrayList<>(unions) : new ArrayList<>();
    }

    public String getMainType() { return mainType; }
    public boolean isArray() { return array; }
    public List<String> getUnions() { return new ArrayList<>(unions); }

    @Override public String toString() {
        String s = mainType + (array ? "[]" : "");
        if (!unions.isEmpty()) s += "|" + String.join("|", unions);
        return s;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypeAnnotationNode)) return false;
        TypeAnnotationNode that = (TypeAnnotationNode) o;
        return array == that.array &&
                Objects.equals(mainType, that.mainType) &&
                Objects.equals(unions, that.unions);
    }

    @Override public int hashCode() {
        return Objects.hash(mainType, array, unions);
    }
}
