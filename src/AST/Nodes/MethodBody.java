package AST.Nodes;
public abstract class MethodBody extends StatementNode {

    public  String codegenerate(){
        System.out.println("body:"+codegeneratee());
        return codegeneratee();};
    public  abstract String codegeneratee();
}
