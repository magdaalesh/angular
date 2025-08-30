package AST.Nodes;

import java.util.Collections;

public class TextContent extends Value {
    private String text;

    public TextContent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public Expr asExpr() {
        // رجّعها كـ String literal في التعبير
        return new ValueExpr(null,new  IdValue(Collections.singletonList(text)));
    }

    @Override
    public String codegenerateInternal() {
        return "\"" + text + "\""; // يولّدها كسلسلة نصية في JS
    }

    @Override
    public String toString() {
        return "TextContent{" + text + "}";
    }
}
