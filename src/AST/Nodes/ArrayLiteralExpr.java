package AST.Nodes;

import java.util.*;
import java.util.stream.Collectors;

public final class ArrayLiteralExpr extends Expr {
    private final List<SpreadItem> items;

    public ArrayLiteralExpr(List<SpreadItem> items) {
        this.items = Collections.unmodifiableList(new ArrayList<>(items));
    }

    public List<SpreadItem> getItems() { return items; }

    @Override
    public String toString() {
        return "[" + items.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public String codegenerae() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < items.size(); i++) {
            sb.append(items.get(i).codegenerate());
            if (i < items.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    protected String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < items.size(); i++) {
            SpreadItem item = items.get(i);
            sb.append(item.codegenerate());

            if (i < items.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");  // اغلق المصفوفة
        return sb.toString();
    }
}
