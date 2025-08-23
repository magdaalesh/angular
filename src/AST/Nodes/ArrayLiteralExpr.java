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
        return "[" + items.stream().map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";
    }
}
