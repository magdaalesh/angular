package AST.Nodes;

public final class ArrowExpr extends Expr {
    private final String param;
    private final Expr body;

    public ArrowExpr(String param, Expr body) {
        this.param = param;
        this.body = body;
    }

    public String getParam() { return param; }
    public Expr getBody() { return body; }

    @Override
    public String toString() {
        return param + " => " + body;
    }



    @Override
    protected String codegenerateInternal() {
        return param + " => " + body.codegenerate();
    }
}
