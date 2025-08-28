package AST.Nodes;

public abstract class Value  extends Node {
    public abstract String toString();

    @Override
    public String codegenerate() {
        System.out.println(codegeneratre());

        return  codegeneratre();
    }

    public   abstract String codegeneratre() ;

}
