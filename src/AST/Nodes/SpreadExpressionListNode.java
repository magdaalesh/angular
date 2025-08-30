package AST.Nodes;

import java.util.*;
import java.util.stream.Collectors;

public final class SpreadExpressionListNode extends Expr {
    private final List<SpreadItem> items;

    public SpreadExpressionListNode(List<SpreadItem> items) {
        this.items = Collections.unmodifiableList(new ArrayList<>(items));
    }

    public List<SpreadItem> getItems() { return items; }

    @Override
    public String toString() {
        return items.stream().map(Object::toString).collect(Collectors.joining(", "));
    }




    @Override
    protected String codegenerateInternal() {  // <-- تنفيذ الدالة abstract الصحيحة
        return items.stream()
                .map(SpreadItem::codegenerate)
                .collect(Collectors.joining(", "));
    }
}
