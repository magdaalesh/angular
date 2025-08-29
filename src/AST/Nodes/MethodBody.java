package AST.Nodes;

public abstract class MethodBody extends StatementNode {

    @Override
    public String codegenerate() {

        System.out.println("body: " + this.codegenerateInternal());
        return this.codegenerateInternal();
    }


    protected abstract String codegenerateInternal();
}
