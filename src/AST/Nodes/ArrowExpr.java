package AST.Nodes;

import java.util.Objects;

public final class ArrowExpr extends Expr {
    private final String param;
    private final Expr body;

    public ArrowExpr(String param, Expr body) {
        this.param = Objects.requireNonNull(param, "param");
        this.body  = Objects.requireNonNull(body, "body");
    }

    public String getParam() { return param; }
    public Expr getBody()    { return body; }

    @Override
    public String toString() {
        return param + " => " + body;
    }


    @Override
    public String codegenerae() {

        return param + " => " + body.codegenerae();
    }

}
