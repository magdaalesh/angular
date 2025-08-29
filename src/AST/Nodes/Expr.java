package AST.Nodes;

public abstract class Expr extends MethodBody {

    @Override
    public String codegenerate() {

        System.out.println("exp : " + this.codegenerateInternal());
        return this.codegenerateInternal();
    }


    protected abstract String codegenerateInternal();
}
