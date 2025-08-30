package AST.Nodes;

public abstract class Expr extends MethodBody {

    @Override
    public final String codegeneratee() {
        String out = codegenerae();
        return (out == null) ? "" : out.trim();
    }

    public abstract String codegenerae();
}
