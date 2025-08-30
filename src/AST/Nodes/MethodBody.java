package AST.Nodes;
public abstract class MethodBody extends StatementNode {

    public  String codegenerate(){

        return codegenerateInternal();};

}
