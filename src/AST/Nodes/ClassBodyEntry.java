package AST.Nodes;

public abstract class ClassBodyEntry extends Node {

    @Override
    public abstract String toString();

    @Override
    public  String codegenerate(){return codegenerae();};
;
    public abstract String codegenerae();
}
