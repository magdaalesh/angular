package AST.Nodes;

public abstract class Expr extends MethodBody {
    @Override
    public String codegeneratee() {
        System.out.println("exp : "+ codegenerae());
        return codegenerae();
    }

    public abstract String codegenerae() ;
}
